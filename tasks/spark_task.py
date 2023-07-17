from pyspark.sql import SparkSession
import uuid, os
import tasks.helpers_tasks as ht
from tasks.blob_storage import Blob
import datetime
from pyspark.sql import functions as F
from pyspark.sql import DataFrame as sparkDataFrame

STORAGE_ACCOUNT='spotpricingstoragedev'
KEY_VAULT_URI='https://spot-pricing-kv-dev.vault.azure.net/'

APP_ID = os.getenv('APP_ID')
TENANT_ID = os.getenv('TENANT_ID')
APP_SECRET = os.getenv('APP_SECRET')

STORAGE_ACCOUNT_URL='spotpricingstoragedev.blob.core.windows.net'
    
def get_azure_spark_connection():
    accnt_key = \
        ht\
        .get_key_vault_secret(APP_ID, 
                              TENANT_ID, 
                              APP_SECRET, 
                              KEY_VAULT_URI,
                              f"{STORAGE_ACCOUNT}-account-key")
    
    spark = \
        SparkSession\
        .builder\
        .appName("SpotPricingSpark")\
        .getOrCreate()
        
    spark.sparkContext\
        ._jsc\
        .hadoopConfiguration()\
        .set(f"fs.azure.account.key.{STORAGE_ACCOUNT}.dfs.core.windows.net", 
             accnt_key)

    return spark

def run(job_id:str):
    blob = Blob(STORAGE_ACCOUNT_URL, APP_ID, TENANT_ID, APP_SECRET)
    
    start = \
        datetime.datetime.today()\
            -datetime.timedelta(days=60)
            
    end = datetime.datetime.today()
    
    output_file = f'output-{job_id}.tsv'
    spark = get_azure_spark_connection()
    
    curr = start
    paths = []
    
    while curr < end:
        h = datetime.datetime.strftime(curr, "%Y/%m/Data_%Y_%m_%d.ss")
        file_url = \
            f"abfss://cosmosdata@{STORAGE_ACCOUNT}.dfs.core.windows.net/MCIO.CapacityUtilization.Prod/PublishedData/Microsoft.Cloud.MCIO/FaComputeUsageDaily/{h}"
        
        exists = blob.blob_exists("cosmosdata", f"MCIO.CapacityUtilization.Prod/PublishedData/Microsoft.Cloud.MCIO/FaComputeUsageDaily/{h}")
        if exists:
            paths += [file_url]
            
        curr = curr + datetime.timedelta(days=1)
    
    print(paths)
    paths = ";".join(paths)
    
    df:sparkDataFrame = \
    spark\
        .read\
        .format('sstream')\
        .load(paths)
        
    df:sparkDataFrame = \
    df\
    .groupBy("Region", 
             "OperatingSystem", 
             "VMSeries", 
             "ComputeVMSize")\
    .agg(F.sum("TotalQuantity").alias("TotalQuantity"))
    
    # df.show(100)
    
    df\
    .coalesce(1)\
    .write\
    .option("header", "true")\
    .option("delimiter", ",")\
    .csv(f"abfss://cosmosdata@{STORAGE_ACCOUNT}.dfs.core.windows.net/aks_outputs/{job_id}")
    
    with open(output_file, "w") as f:
        f.write('SUCCESS !!!')
        
    return output_file

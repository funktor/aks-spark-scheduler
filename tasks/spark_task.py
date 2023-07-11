from pyspark.sql import SparkSession
import uuid, os
import tasks.helpers_tasks as ht

STORAGE_ACCOUNT='spotpricingstoragedev'
KEY_VAULT_URI='https://spot-pricing-kv-dev.vault.azure.net/'
    
def get_azure_spark_connection(): 
    app_id = os.getenv('APP_ID')
    tenant_id = os.getenv('TENANT_ID')
    app_secret = os.getenv('APP_SECRET')
    
    accnt_key = \
        ht\
        .get_key_vault_secret(app_id, 
                              tenant_id, 
                              app_secret, 
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
    output_file = f'output-{job_id}.tsv'
    file_url = \
        f"abfss://cosmosdata@{STORAGE_ACCOUNT}.dfs.core.windows.net/MCIO.CapacityUtilization.Prod/PublishedData/Microsoft.Cloud.MCIO/FaComputeUsageDaily/2023/06/Data_2023_06_15.ss"
    
    spark = get_azure_spark_connection()
    
    df = \
    spark\
        .read\
        .format('sstream')\
        .load(file_url)
        
    df.show(100)
        
    df = df.limit(1000).toPandas()
    print(df)
    
    df.to_csv(output_file, 
              sep="\t", 
              header=True, 
              index=False)
    
    return output_file

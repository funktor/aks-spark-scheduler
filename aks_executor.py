from tasks import spark_task as mytask
import os, uuid
from blob_storage import Blob

if __name__ == '__main__':
    job_id = str(uuid.uuid4())

    blob_storage_url = os.getenv('BLOB_STORAGE_URL')
    app_id = os.getenv('APP_ID')
    tenant_id = os.getenv('TENANT_ID')
    app_secret = os.getenv('APP_SECRET')
    blob_storage_out_container = os.getenv('BLOB_STORAGE_OUT_CONTAINER')

    # Initializing blob
    blob = Blob(blob_storage_url, 
                app_id, 
                tenant_id, 
                app_secret)
    
    print("Running tasks...")
    output_file = mytask.run(job_id)
    
    print("Uploading task outputs...")
    blob.upload_file_to_container(\
        local_file_path=\
            output_file, 
        output_container=blob_storage_out_container, 
        output_file_path=\
            os.path.join(job_id, output_file)
    )

    print("Done")
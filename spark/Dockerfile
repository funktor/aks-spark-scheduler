ARG base_img

FROM $base_img
WORKDIR /

# Reset to root to run installation tasks
USER 0

RUN mkdir ${SPARK_HOME}/python
RUN apt-get update && \
    apt install -y wget python3 python3-pip && \
    pip3 install --upgrade pip setuptools && \
    rm -r /root/.cache && rm -rf /var/cache/apt/*

COPY python/pyspark ${SPARK_HOME}/python/pyspark
COPY python/lib ${SPARK_HOME}/python/lib
COPY app/requirements.txt .
RUN pip3 install -r /requirements.txt

WORKDIR /opt/spark/work-dir

# Download hadoop-azure, azure-storage, and dependencies (See above)
RUN wget --quiet https://repo1.maven.org/maven2/org/apache/hadoop/hadoop-azure/3.3.5/hadoop-azure-3.3.5.jar -O /opt/spark/jars/hadoop-azure-3.3.5.jar
RUN wget --quiet https://repo1.maven.org/maven2/com/microsoft/azure/azure-storage/7.0.1/azure-storage-7.0.1.jar -O /opt/spark/jars/azure-storage-7.0.1.jar
RUN wget --quiet https://repo1.maven.org/maven2/com/microsoft/azure/azure-keyvault-core/1.0.0/azure-keyvault-core-1.0.0.jar -O /opt/spark/jars/azure-keyvault-core-1.0.0.jar
RUN wget --quiet https://repo1.maven.org/maven2/org/apache/httpcomponents/httpclient/4.5.13/httpclient-4.5.13.jar -O /opt/spark/jars/httpclient-4.5.13.jar
RUN wget --quiet https://repo1.maven.org/maven2/org/eclipse/jetty/jetty-util-ajax/9.4.48.v20220622/jetty-util-ajax-9.4.48.v20220622.jar -O /opt/spark/jars/jetty-util-ajax-9.4.48.v20220622.jar
RUN wget --quiet https://repo1.maven.org/maven2/org/wildfly/openssl/wildfly-openssl/1.1.3.Final/wildfly-openssl-1.1.3.Final.jar -O /opt/spark/jars/wildfly-openssl-1.1.3.Final.jar
RUN wget --quiet https://repo1.maven.org/maven2/org/apache/httpcomponents/httpcore/4.4.13/httpcore-4.4.13.jar -O /opt/spark/jars/httpcore-4.4.13.jar
RUN wget --quiet https://repo1.maven.org/maven2/commons-logging/commons-logging/1.1.3/commons-logging-1.1.3.jar -O /opt/spark/jars/commons-logging-1.1.3.jar
RUN wget --quiet https://repo1.maven.org/maven2/commons-codec/commons-codec/1.15/commons-codec-1.15.jar -O /opt/spark/jars/commons-codec-1.15.jar
RUN wget --quiet https://repo1.maven.org/maven2/org/eclipse/jetty/jetty-util/9.4.48.v20220622/jetty-util-9.4.48.v20220622.jar -O /opt/spark/jars/jetty-util-9.4.48.v20220622.jar
RUN wget --quiet https://repo1.maven.org/maven2/org/apache/hadoop/thirdparty/hadoop-shaded-guava/1.1.1/hadoop-shaded-guava-1.1.1.jar -O /opt/spark/jars/hadoop-shaded-guava-1.1.1.jar

COPY app /
ENV PATH=$PATH:/app
ENV PYTHONPATH /app

ENTRYPOINT [ "/opt/entrypoint.sh" ]

# Specify the User that the actual main process will run as
ARG spark_uid=185
USER ${spark_uid}

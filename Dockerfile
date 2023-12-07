FROM openjdk
EXPOSE 8081
ADD target/servicehub-ms-new.jar servicehub-ms-new.jar
ENTRYPOINT ["java","-jar","/servicehub-ms-new.jar"]
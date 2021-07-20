FROM openjdk:8
EXPOSE 8080
ADD target/docker-ms-example.jar docker-ms-example.jar
ENTRYPOINT ["java","-jar","/docker-ms-example.jar"]

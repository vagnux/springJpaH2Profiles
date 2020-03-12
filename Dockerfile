FROM java:8
EXPOSE 8080
ADD /target/springJpa-0.0.1-SNAPSHOT.jar springJpa-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","springJpa-0.0.1-SNAPSHOT.jar"]

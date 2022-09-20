FROM openjdk:17
WORKDIR /dbt
COPY target/Dockerize-0.0.1-SNAPSHOT.jar /dbt/application.jar
EXPOSE 9898
ENTRYPOINT ["java", "-jar", "application.jar", "--dbt.message=FromDocker"]
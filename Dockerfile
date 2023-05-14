FROM openjdk:8-jdk-alpine

MAINTAINER gonzalo_maunas

COPY target/portfolio-backend-0.0.1-SNAPSHOT.jar portfolio-backend-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","portfolio-backend-0.0.1-SNAPSHOT.jar"]
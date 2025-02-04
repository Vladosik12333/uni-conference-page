FROM openjdk:17.0.1-jdk-slim

EXPOSE 80

COPY target/uni-conference-page-1.0.0-SNAPSHOT.jar  uni-conference-page-1.0.0-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "uni-conference-page-1.0.0-SNAPSHOT.jar"]
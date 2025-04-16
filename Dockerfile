FROM maven:3.9.9-amazoncorretto-17-alpine AS build

WORKDIR /build/

COPY pom.xml /build/

RUN mvn dependency:go-offline

COPY src /build/src

RUN mvn package -DSkipTests

FROM amazoncorretto:17-alpine-jdk

EXPOSE 80

COPY --from=build build/target/*.jar opt/uni-conference-page-1.0.0-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "opt/uni-conference-page-1.0.0-SNAPSHOT.jar"]
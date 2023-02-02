FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ./target/spring-boot-dockarisation.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
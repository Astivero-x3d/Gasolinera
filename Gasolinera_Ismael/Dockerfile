FROM openjdk:21-jdk-slim
ARG JAR_FILE=target/Gasolinera_Ismael-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app_gasolinera.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_gasolinera.jar"]
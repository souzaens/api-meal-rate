FROM library/openjdk:11-slim
EXPOSE 8080
COPY target/api-meal-rate-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT exec java -jar /app.jar
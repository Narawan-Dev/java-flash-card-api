FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdp-slim
COPY --from=build /target/flashcard-api-0.0.1-SNAPSHOT.jar flashcard-api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "flashcard-api.jar"]
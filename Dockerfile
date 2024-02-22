FROM maven:3.9.5 AS build
WORKDIR /app
COPY . /app/
RUN mvn clean package

FROM eclipse-temurin:21
WORKDIR /app
COPY --from=build /app/target/*.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

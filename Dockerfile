FROM maven:3.8.4-openjdk-17
EXPOSE 8080
ADD target/shop-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
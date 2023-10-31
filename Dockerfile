FROM eclipse-temurin:17-jdk-alpine
LABEL authors="jz1248"
CMD mvn clean install -DskipTests
COPY target/*.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]

FROM openjdk:17-jdk-slim
EXPOSE 8082
ADD target/docker-jenkin-demo-app.jar docker-jenkin-demo-app.jar
ENTRYPOINT ["java","-jar","docker-jenkin-demo-app.jar"]

#Dockerfile
FROM openjdk:17.0.2-slim
ADD build/libs/sticker-0.1.jar sticker.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","sticker.jar"]
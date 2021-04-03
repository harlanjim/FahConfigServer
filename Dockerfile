FROM openjdk:11-jdk
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
CMD ["sh", "-c", "java -jar /app.jar"]
EXPOSE 9050

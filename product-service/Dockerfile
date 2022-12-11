FROM openjdk:17-slim as build
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf /app.jar)
ENTRYPOINT ["java", "-jar", "/app.jar"]
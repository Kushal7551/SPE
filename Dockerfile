
FROM openjdk:11-jre-slim

WORKDIR /app

COPY ./target/cal-1.0.0-jar-with-dependencies.jar /app/

CMD ["java", "-jar", "cal-1.0.0-jar-with-dependencies.jar"]

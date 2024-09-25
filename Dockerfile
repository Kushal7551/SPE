# Use the official OpenJDK 11 image as the base image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the host to the container
COPY ./target/cal-1.0.0-jar-with-dependencies.jar /app/

# Run the JAR file
CMD ["java", "-jar", "cal-1.0.0-jar-with-dependencies.jar"]

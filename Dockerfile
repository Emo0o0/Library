# Use an OpenJDK base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the JAR file into the container
COPY rest/target/Library.jar library-app.jar

# Expose port for the app
EXPOSE 8081

# Run the JAR file
ENTRYPOINT ["java", "-jar", "library-app.jar"]

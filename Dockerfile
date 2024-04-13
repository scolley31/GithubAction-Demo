FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app


# Copy the .mvn directory (used by Maven for configuration) from the local project to the container
COPY .mvn/ .mvn
# Copy the Maven wrapper script (mvnw), the project's POM file (pom.xml), and the root directory to the container
COPY mvnw pom.xml ./
# Resolve project dependencies using Maven
RUN ./mvnw dependency:resolve
# Copy the source code from the local project to the container
COPY src ./src
# Build the Spring Boot application and create a JAR file
RUN ./mvnw package

COPY /target/githubaction-0.0.1-SNAPSHOT.jar ./app.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java  -jar app.jar"]

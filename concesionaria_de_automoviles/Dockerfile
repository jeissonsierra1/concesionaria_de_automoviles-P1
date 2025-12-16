
FROM eclipse-temurin:17-jdk-alpine AS builder
WORKDIR /app


COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .


COPY src src


RUN chmod +x ./mvnw
RUN ./mvnw clean package -DskipTests


FROM eclipse-temurin:17-jre-alpine
WORKDIR /app


COPY --from=builder /app/target/concesionaria_de_automoviles-0.0.1.jar app.jar


EXPOSE 8080


ENTRYPOINT ["java", "-Dserver.port=8080", "-jar", "app.jar"]
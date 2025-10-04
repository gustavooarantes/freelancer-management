# ===== Stage 1: Build =====
FROM eclipse-temurin:21-jdk-focal AS build
WORKDIR /app
COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:go-offline -B
COPY src src
RUN ./mvnw clean package -DskipTests

# ===== Stage 2: Runtime =====
FROM eclipse-temurin:21-jre-focal
WORKDIR /app
COPY --from=build /app/target/freelancer-management-0.0.1-SNAPSHOT.jar app.jar
ENV SPRING_PROFILES_ACTIVE=prod
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]

FROM eclipse-temurin:17-jdk AS compile
WORKDIR /app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:17-jdk AS prod
WORKDIR /app
COPY --from=compile /app/target/*.jar app.jar
EXPOSE 8085

CMD [ "java","-jar","app.jar" ]

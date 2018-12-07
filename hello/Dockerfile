FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/hello-0.0.1-SNAPSHOT.jar hello.jar
ENTRYPOINT ["java", "-Denv.name=Dev", "-jar", "/hello.jar"]
FROM openjdk:latest
COPY ./target/GroupC-Coursework-0.1.0.1-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "GroupC-Coursework-0.1.0.1-jar-with-dependencies.jar"]
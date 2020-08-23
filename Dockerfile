FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /target/Project-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 7900
ENV JAVA_OPTS=""
RUN sh -c "touch Project-0.0.1-SNAPSHOT.jar"
ENTRYPOINT [ "java", "-jar", "Project-0.0.1-SNAPSHOT.jar" ]
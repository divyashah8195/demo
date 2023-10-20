FROM openjdk:17

COPY target/demo.jar /usr/app

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "/demo.jar"]

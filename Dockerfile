FROM openjdk:17

COPY demo/target/demo.jar /

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "/demo.jar"]

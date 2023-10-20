FROM openjdk:17

ADD target/demo.jar /usr/app

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "/demo.jar"]

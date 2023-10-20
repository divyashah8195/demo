FROM openjdk:17

ADD target/demo-0.0.1-SNAPSHOT.jar /usr/app

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]

FROM openjdk:17-alpine

ADD target/demo.jar ROOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "ROOT.jar"]
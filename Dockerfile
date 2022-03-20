

FROM openjdk:8 

EXPOSE 8080

ADD target/multplication-dev-0.1.jar multplication-dev-0.1.jar

ENTRYPOINT ["jar", "-jar", "multplication-dev-0.1.jar"]

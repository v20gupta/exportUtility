FROM openjdk:11
MAINTAINER Vibhor Gupta
ADD target/service1.jar service1.jar
ENV PORT 9300
ENV DISCOVERY_URL http://192.168.99.100:9200
ENTRYPOINT ["java", "-jar", "/person-service.jar"]
EXPOSE ${PORT}
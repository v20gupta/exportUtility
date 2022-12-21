FROM openjdk:alpine
MAINTAINER Vibhor Gupta
ADD target/service2.jar service2.jar
ENV PORT 9400
ENV DISCOVERY_URL http://192.168.99.100:9200
ENTRYPOINT ["java", "-jar", "/product-service.jar"]
EXPOSE ${PORT}
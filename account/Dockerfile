#Start with base image containing java runtime
FROM openjdk:17-alpine as build


#Information of maintainer of image optional
MAINTAINER phearunbank

#Add the application's jar to the container
COPY target/account-0.0.1-SNAPSHOT.jar account-0.0.1-SNAPSHOT.jar

#Execute application
ENTRYPOINT ["java", "-jar", "/account-0.0.1-SNAPSHOT.jar"]

 #docker build . -t phearunbank/account


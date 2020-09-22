FROM openjdk:8u191-jre-alpine3.8

RUN apk add curl jq

#workspace
WORKDIR /usr/share/udemy

#add jar file to image
ADD target/selenium-docker.jar selenium-docker.jar
ADD target/selenium-docker-tests.jar selenium-docker-tests.jar
ADD target/libs libs

#add suite file
ADD testng.xml testng.xml

#add healthchek script
ADD healthcheck.sh healthcheck.sh

ENTRYPOINT sh healthcheck.sh


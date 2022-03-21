FROM openjdk:11

COPY /build/libs/*.jar /usr/src/app.jar
WORKDIR /usr/src

CMD ["java","-jar","/usr/src/app.jar"]
FROM openjdk:20
COPY ./bin /tmp
WORKDIR /tmp
ENTRYPOINT ["java","application.traveltour.travelandtour.traveltour"]
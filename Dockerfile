ARG PORT=5432

FROM maven:3.8.4-openjdk-17 AS prebuild

USER root

RUN mkdir -p /home/root/app
WORKDIR /home/root/app

COPY --chown=root:root . /home/root/app

RUN mvn package


FROM openjdk:17-jdk as finalbuild

USER root


RUN mkdir -p /home/root/app

WORKDIR /home/root/app

COPY --chown=root:root --from=prebuild /home/root/app/target/*.jar /home/root/app/app.jar
COPY --chown=root:root --from=prebuild /home/root/app/wait-for-it.sh /home/root/app/wait-for-it.sh
RUN chmod 777 /home/root/app/wait-for-it.sh


EXPOSE 8081:8081

CMD ["java", "-jar", "app.jar", "${PORT}"]

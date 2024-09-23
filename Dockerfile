# FROM openjdk:11

COPY ./target/Calculator-SPE-MiniProject-1.0-SNAPSHOT.jar ./

WORKDIR ./

CMD ["java", "-jar","Calculator-SPE-MiniProject-1.0-SNAPSHOT.jar"]
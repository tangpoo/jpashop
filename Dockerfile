# 베이스 이미지 설정
FROM amazoncorretto:17.0.7

EXPOSE 8080

ARG JAR_FIRE=./build/libs/*-SNAPSHOT.jar

COPY ${JAR_FIRE} app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]

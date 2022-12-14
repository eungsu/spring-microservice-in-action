### stage 1
# 도커 런타임에 사용될 도커 이미지를 지정한다.
FROM openjdk:17-slim

# docker-maven-plugin에 설정된 JAR_FILE 변수를 정의한다.
# <buildArgs>
#	<JAR_FILE>target/${project.build.finalName}.jar</JAR_FILE>
# </buildArgs>
ARG JAR_FILE
ENV TZ=Asia/Seoul

# jar 파일을 이미지의 파일 시스템에 app.jar로 복사한다.
COPY ${JAR_FILE} app.jar

# 빌드 이미지의 파일 시스템에 복사한 app.jar의 압축을 푼다.
ENTRYPOINT ["java", "-jar", "app.jar"]
# 基于openjdk 镜像
FROM openjdk:8-jdk-alpine

# 将本地文件夹挂在到当前容器
VOLUME /tmp

ENV DUBBO_IP_TO_REGISTRY 35.189.127.74
ENV DUBBO_PORT_TO_REGISTRY 20832

# 复制文件到容器
ADD boot-wedding-service-0.0.1-SNAPSHOT.jar app.jar

# 声明需要暴露的端口
EXPOSE 20880 7001

# 配置容器启动后执行的命令
ENTRYPOINT ["java","-jar","/app.jar"]
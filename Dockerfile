# 指定维护者的名字
MAINTAINER lihao/2470960095@qq.com

# 该镜像需要依赖的基础镜像
FROM java:8

# 将当前目录下的jar包复制到docker容器的/目录下
ADD springboot-web/target/springboot-web-1.0-SNAPSHOT.jar /springboot-cli.jar

# 声明服务运行在8001端口
EXPOSE 8001

# 指定docker容器启动时运行jar包
ENTRYPOINT ["java", "-jar","/springboot-cli.jar"]
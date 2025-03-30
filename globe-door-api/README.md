# globe-door

# 目标
* 简单、小巧
* 有设计、扩展性强


# 设计图

# 打包
mvn clean package

./mvnw clean package

mvn -Pnative native:compile

./target/globe-door-api --spring.config.location=file:src/main/resources/application.yaml

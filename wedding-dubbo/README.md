基于`dubbo` `zookeeper` `spring-boot` `mybatis` 的分布式婚礼系统
### 集成开发环境
* `idea`
* `java 1.8`
* `dubbo 2.7.8`
* `zookeeper 3.6.3`
* `springBoot 2.5.2`
* `mybatis 1.3.2`
* `mysql 5.7`

### 部署方式
* 拉取代码
```
git clone git@github.com:NextSemeste/wedding-dubbo.git
```
* 进入`zookeeper\apache-zookeeper-3.6.3-bin\bin`目录
* 执行`zkCli.cmd`，`zkServer.cmd`
* 在`mysql`数据库中执行hlh_db.sql，创建数据库
* 将`wedding-dubbo`项目导入idea中
* 运行`boot-wedding-service`模块中的`BootWeddingServiceApplication.java`
* 运行`boot-wedding-springweb`模块中的`BootWeddingSpringwebApplication.java`
* 本地启动完成后，浏览器访问
```
  访问页面：http://127.0.0.1:7002/login.html
  初始用户名: 15527630737
  初始密码: 123456
  验证码：根据显示图片输入
  ```
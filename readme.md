# View Redis 

- 嵌入式 Redis 可视化管理项目.


## Feature
- Redis 服务信息
- Redis key 搜索
- Redis 键值查看

## install 

```shell script
git clone https://github.com/huifer/view-redis.git
cd view-redis
mvn clean install 
```



## Using
### 第一种
- 引入依赖

```xml
<dependency>
    <groupId>com.github.huifer</groupId>
    <artifactId>view-redis-boot</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

- 在启动类上增加注解`@EnableViewRedis`
- 如果有拦截器请将`/redis/**/`作为忽略,不执行拦截器逻辑
- 访问 `/redis/index` 进入管理页面

### 第二种
- 引入依赖

```xml
<dependency>
    <groupId>com.github.huifer</groupId>
    <artifactId>view-redis-servlet</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>

```

- 在启动类上添加`@EnableViewRedisServlet`
- 设置账号密码, 默认账号密码: **redis-admin\redis-admin**,配置信息如下

```
view:
  redis:
    login_name: admin
    password: admin
```

- 访问: `/redis/` 


## 系统截图
- redis 配置相关截图

![image-20201015163347917](images/image-20201015163347917.png)


- redis 键值查询

![image-20201015163400296](images/image-20201015163400296.png)

![image-20201015163412168](images/image-20201015163412168.png)



## Contributers
- [@huifer](https://github.com/huifer)


## License
- Apache License 2.0
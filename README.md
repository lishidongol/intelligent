# intelligent

### 项目简介
暂时只做基于角色的权限管理系统

### 技术选型
* 基础框架： Spring Boot 2.1.1.RELEASE
* 持久层框架：Spring Data JPA 
* 安全框架：Spring Security
* 数据库连接池：Druid 1.1.10
* 缓存框架：Redis

### 开发环境
* 语言：Java 8
* IDE：IntelliJ IDEA 2018.3
* 依赖管理：Maven3
* 数据库：MySql 8.0
* 版本管理：Git

### 模块说明
模块 | 说明
----- | -----
intelligent-web | web模块，控制层
intelligent-service | 服务层
intelligent-dao | 数据库操作层
intelligent-pojo | 包括do、vo、dto等
intelligent-config | 系统配置层
intelligent-common | 公共模块

### 一些约定 （参考阿里巴巴Java开发手册1.4）
各层命名规约:

* Service/DAO层方法命名规约(本项目controller层同样使用这种命名规约)
1) 获取单个对象的方法用get做前缀。
2) 获取多个对象的方法用list做前缀，复数形式结尾如:listObjects。 
3) 获取统计值的方法用count做前缀。
4) 插入的方法用save/insert做前缀。
5) 删除的方法用remove/delete做前缀。
6) 修改的方法用update做前缀。

* 领域模型命名规约
1) 数据对象:xxxDO，xxx即为数据表名。
2) 数据传输对象:xxxDTO，xxx为业务领域相关的名称。 
3) 展示对象:xxxVO，xxx一般为网页名称。
4) POJO是DO/DTO/BO/VO的统称，禁止命名成xxxPOJO。

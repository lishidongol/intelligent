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

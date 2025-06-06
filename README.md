# 🌟  Mall System 后端框架


该项目是 **一个基于 Spring Boot 构建的后端框架**，方便用户基于基础模块快速扩展不同业务场景。项目包括系统基础设计、公用组件、日志管理、访问日志记录、分步控制、存储和缓存等基础工程模块。

本项目 非基于实际零售或商业基础，不包含完整的零售商城功能，重点是基础组件和后端技术栈接入。



## 🛠 技术栈

| 分类   | 技术                             |
|------|--------------------------------|
| 后端框架 | Spring Boot (Web,AOP,Security) |
| 数据库  | MySQL + MyBatis + PageHelper   |
| 缓存   | Spring Data Redis              |
| 搜索   | Elasticsearch 数据索引和搜索          |
| 事件系统 | RabbitMQ (延迟队列、消费等)            |
| 存储   | MinIO 对象存储                     |
| 持久层  | MyBatis Generator 自动生成         |
| 日志   | SLF4J + Logback 日志托管           |
| 接口文档 | Swagger + Springfox            |
| 跨域配置 | CorsFilter 全局配置                |
| 其他   | Lombok, Hutool, Druid          |

---

## 📦 快速启动

> 你需要先本地安装好 MySQL，并创建数据库 `mall_tiny`。

1. 克隆项目并进入 mall-system 模块：
   ```bash
   git clone https://github.com/AlanZhaoxdd/mall-ecommerce-system.git
   cd mall-system

2. 修改数据库配置（在 application.yml 中）：
    ```yaml
   spring:
     datasource:
       url: jdbc:mysql://localhost:3306/mall-ecommerce-system
       username: root
       password: root
   
3. 启动项目（使用 IDE 或命令行）：
   ```bash
   mvn spring-boot:run

4. 访问 Swagger 接口文档（默认端口为 8080）：
   ```bash
   http://localhost:8080/swagger-ui/

## ✏️ 学习目标
本项目旨在通过完整实践掌握以下后端开发核心技能：

- Spring Boot 项目结构设计
- 通用组件配置与组合模式
- 接口封装与通用返回结构设计
- MyBatis Generator 使用与自定义配置
- Redis 和 Elasticsearch 接入实践
- MinIO 存储和文件上传
- Swagger3 接口文档配置
- RabbitMQ 延迟队列和消息处理模型
- MongoDB 保存用户操作记录
- CORS 全局跨域配置实践
- 多模块 Git 管理与协作
- 为简历积累完整项目模块经验  

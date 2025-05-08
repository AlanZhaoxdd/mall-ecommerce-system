# 🌟 Mall System 电商后台管理子系统


该项目是 **一套完整的前后端分离电商系统**，采用 Spring Boot 作为后端框架，Vue 实现后台管理页面交互，uni-app 实现移动端前台商城展示，并通过 Docker 实现容器化部署，支持快速上线与环境一致性配置。系统功能全面，覆盖电商业务的各个核心模块。

## 🧩 项目功能概览

### 🛍 前台商城系统功能：

- 首页门户
- 商品推荐
- 商品搜索
- 商品展示
- 购物车
- 订单流程
- 会员中心
- 客户服务
- 帮助中心

### 🖥 后台管理系统功能：

- 商品管理
- 订单管理
- 会员管理
- 促销管理
- 运营管理
- 内容管理
- 统计报表
- 财务管理
- 权限管理
- 系统设置

---

## 🛠 技术栈

| 分类     | 技术                           |
|----------|--------------------------------|
| 后端框架 | Spring Boot                    |
| 数据库   | MySQL + MyBatis + PageHelper  |
| 持久层   | MyBatis Generator 自动生成     |
| 接口文档 | Swagger + Springfox            |
| 其他     | Lombok, Hutool, Druid          |

---

## 📦 快速启动

> 你需要先本地安装好 MySQL，并创建数据库 `mall_tiny`。

1. 克隆项目并进入 mall-system 模块：
   ```bash
   git clone https://github.com/YOUR_USERNAME/YOUR_REPO.git
   cd mall-system

2. 修改数据库配置（在 application.yml 中）：
    ```yaml
   spring:
     datasource:
       url: jdbc:mysql://localhost:3306/mall_tiny
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
- MyBatis Generator 使用与自定义配置
- 接口封装与通用返回结构设计
- 多模块 Git 管理与协作
- 为简历积累完整项目模块经验  

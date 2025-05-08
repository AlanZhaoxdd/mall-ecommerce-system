package com.macro.mall.system.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description MyBatis配置类
 * @date 2025/5/8
 */
@Configuration
@MapperScan({"com.macro.mall.system.mbg.mapper","com.macro.mall.system.dao"})
public class MyBatisConfig {
}

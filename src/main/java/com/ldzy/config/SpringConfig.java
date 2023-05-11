package com.ldzy.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"com.ldzy.service"})
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {
    //相当于spring配置文件
}

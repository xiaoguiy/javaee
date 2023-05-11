package com.ldzy.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@PropertySource("classpath:db.properties")
public class JdbcConfig {
    //该配置类的作用:读取数据库参数,生成数据源对象,添加到spring容器中
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.myDriver}")
    private String driver;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.pwd}")
    private String pwd;

    @Bean
    public DataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setUrl(url);
        ds.setDriverClassName(driver);
        ds.setUsername(username);
        ds.setPassword(pwd);
        return ds;
    }
}

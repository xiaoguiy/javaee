package com.ldzy.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

public class MybatisConfig {
    //读取sql映射文件,生成SqlSessionFactoryBean对象,添加到spring容器中
    //生成MapperScannerConfigurer对象,添加到spring容器中
    @Bean
    public SqlSessionFactoryBean getSqlSessionFactoryBean(DataSource ds) throws IOException {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(ds);
        factoryBean.setTypeAliasesPackage("com.ldzy.pojo");
        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
        return factoryBean;
    }

    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.ldzy.mapper");
        return mapperScannerConfigurer;
    }
}

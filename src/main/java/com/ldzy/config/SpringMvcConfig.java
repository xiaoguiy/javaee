package com.ldzy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.ldzy.controller","com.ldzy.exception"})
@EnableWebMvc
public class SpringMvcConfig {
}

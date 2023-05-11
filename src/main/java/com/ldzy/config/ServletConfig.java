package com.ldzy.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override//加载spring配置文件
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override//加载spring配置文件
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    @Override//所有的请求都要到达DispatcherServlet,由它来派发给对应的控制器来处理请求
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

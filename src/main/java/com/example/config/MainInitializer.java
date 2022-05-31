package com.example.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MainInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    //基本的Spring配置类，一般用于业务层管理 根容器
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{MainConfiguration.class};
    }

    @Override
    //配置DispatcherServlet的配置类，主要用于Controller等配置
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfiguration.class};
    }

    @Override
    //配置路径，与上面一致 匹配路径 默认根目录
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

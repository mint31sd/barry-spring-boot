/*
package com.example.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    //使用如下这种方式，可以让所有的WebMvcConfigurerAdapter组件都会一起起作用
    @Bean //将组件注册在容器
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            */
/**
             * 添加静态资源映射器
             * @param registry
             *//*

            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                super.addResourceHandlers(registry);
                registry.addResourceHandler("/asserts/**").addResourceLocations("classpath:/files");
            }
        };
        return adapter;
    }
}
*/

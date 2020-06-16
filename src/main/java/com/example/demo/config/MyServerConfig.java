/*
package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyServerConfig {
    */
/**
     * 配置嵌入式的Servlet容器
     *//*

    @Bean //使用@Bean注解，将该配置添加到Spring容器中
    public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer(){

        return new EmbeddedServletContainerCustomizer() {
            //定制嵌入式的Servlet容器相关的规则
            @Override
            public void customize(ConfigurableEmbeddedServletContainer container) {
                //设置 Server 端口信息
                container.setPort(8088);
                //设置项目访问路径
                container.setContextPath("/demo");
            }
        };
    }
}

*/

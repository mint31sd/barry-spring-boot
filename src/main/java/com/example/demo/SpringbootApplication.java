package com.example.demo;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;

import java.nio.charset.Charset;

@SpringBootApplication
public class SpringbootApplication {

    /**
     * @author wsl
     * @date 2018/6/19 22:38
     * @param
     * @return org.springframework.boot.autoconfigure.http.HttpMessageConverters
     * @desc   通过使用fastjson代替框架中默认的jackson进行json解析
     */
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters(){
        //1.需要先定义一个convert转换消息的对象
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        //2.配置fastjson的配置信息
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat,SerializerFeature.WriteNullNumberAsZero);
        //3.在convert中添加配置信息
        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);

        HttpMessageConverter<?> converter = fastJsonHttpMessageConverter;

        //
        StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        return new HttpMessageConverters(converter,stringHttpMessageConverter);
    }


    public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}

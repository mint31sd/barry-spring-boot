package com.example.demo.web;

import com.example.demo.entity.Barry;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Hawkins on 2018/4/10.
 */
@RestController
@EnableAutoConfiguration
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        System.err.println("进入IndexController12345678");
        return "Hello world,barry hawkins12345678!";
    }

    /**
     * @param
     * @return com.example.demo.entity.Barry
     * @author wsl
     * @date 2018/6/19 21:08
     * @desc springboot使用的json解析框架是jackson
     */
    @RequestMapping("/getBarryPojo")
    public Barry getBarry() {
        Barry barry = new Barry();
        barry.setId(0xa3);
        barry.setName("hawkins");
        barry.setCreateDate(new Date());
        barry.setRemark("Hello,巴里..");

        return barry;
    }


    /**
     * @param
     * @return com.example.demo.entity.Barry
     * @author wsl
     * @date 2018/6/19 23:18
     * @desc 使用spring-boot-devtools插件热部署的作用
     * 1.当修改方法返回值,能够热部署
     * 2.当创建一个新方法时,能够热部署
     * 3.当创建一个新类时,能够热部署
     */
    @RequestMapping("/getBarryPojo2")
    public Barry getBarry2() {
        Barry barry = new Barry();
        barry.setId(0xcd);
        barry.setName("jsck");
        barry.setCreateDate(new Date());
        barry.setRemark("Hello,jsck lsift..");

        return barry;
    }
}

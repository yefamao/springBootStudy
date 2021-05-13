package com.zpark.controller;

import com.zpark.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @Author yefamao
 * @Date 2021/3/9 14:47
 */
//@SpringBootApplication(scanBasePackages = "com") //自动扫描注册包到bean
@RestController //@RestController  =Controller  + responseBody
public class HelloController {
    @Autowired
    private Item item;

    @Autowired
    DataSource dataSource;

    @GetMapping("/hello")  //@GetMapping   @RequestMapping
    public String handle() {
        System.out.println("通过yml文件注入值的item："+item);
        System.out.println("数据源类型是："+dataSource.getClass());
        return "hello Spring Boot 2 !!";
    }

}

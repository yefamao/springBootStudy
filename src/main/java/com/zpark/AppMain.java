package com.zpark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author yefamao
 * @Date 2021/3/9 14:39
 */

@SpringBootApplication
@org.mybatis.spring.annotation.MapperScan("com.zpark.dao") //mybaits提供
@MapperScan("com.zpark.dao")    //tk提供
public class AppMain {
    public static void main(String[] args) {

        SpringApplication.run(AppMain.class, args);

    }

}

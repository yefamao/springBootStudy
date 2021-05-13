package com.zpark.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.zpark.interceptor.Myinterceptor;
import com.zpark.pojo.Item;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;

/**
 * @Author yefamao
 * @Date 2021/3/10 21:11
 */

@Configuration //告诉springboot这是一个配置类,代替xml文件
public class myConfig implements WebMvcConfigurer {
    //拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Myinterceptor())
                .addPathPatterns("/**")       //所有请求都被拦截包括静态资源
                .excludePathPatterns("/index.html","/**.ico");    //放行的请求
    }
    //连接池
    @ConfigurationProperties("spring.datasource")
    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }

    @ConfigurationProperties(prefix = "goods")  //属性注入
    @Bean  //给容器中添加组键，以方法名作为组件ID
    public Item item() {
        Item myitem=new Item();
        return myitem;
    }

}

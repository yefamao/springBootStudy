package com.zpark;

import com.zpark.pojo.Item;
import com.zpark.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author yefamao
 * @Date 2021/3/23 20:12
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
 public class MyTest {
    @Autowired
    ItemService itemService;

    @Test
    public void contextloads(){
        Item item = itemService.findById(1);
        log.info("测试查询功能查出的item是:{}",item);
        System.out.println("hello Test!");
    }

}

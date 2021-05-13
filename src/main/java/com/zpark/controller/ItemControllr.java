package com.zpark.controller;

import com.zpark.pojo.Item;
import com.zpark.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author yefamao
 * @Date 2021/3/25 8:48
 */
@RestController
public class ItemControllr {

    @Autowired
    ItemService itemService;

    @GetMapping("/Item")
    public Item ItemFindById() {
        System.out.println("通过数据库查询到的item："+itemService.findById(1));
        return itemService.findById(1);
    }

    @GetMapping("/SaveItem")
    public String SaveItem(){
        itemService.saveItem(new Item(6,"原味瓜子",88,new Date(),"大包"));
        return "数据保存成功";
    }

}

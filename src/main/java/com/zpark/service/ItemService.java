package com.zpark.service;

import com.zpark.pojo.Item;

/**
 * @Author yefamao
 * @Date 2021/3/23 15:10
 */
public interface ItemService {
    //查询
    Item findById(int id);
    //添加
    void saveItem(Item item);
}

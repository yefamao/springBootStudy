package com.zpark.service.impl;

import com.zpark.dao.ItemDao;
import com.zpark.pojo.Item;
import com.zpark.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author yefamao
 * @Date 2021/3/23 19:01
 */


@Service("itemService")
public class ItemServiceImpl implements ItemService {

    //自动注入
    @Autowired
    private ItemDao itemDao;

    @Override
    public Item findById(int id) {
        return itemDao.findById(id);
    }

    @Override
    public void saveItem(Item item) {
        itemDao.saveItem(item);
    }
}

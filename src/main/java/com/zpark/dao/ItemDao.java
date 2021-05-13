package com.zpark.dao;

import com.zpark.pojo.Item;
import org.apache.ibatis.annotations.Insert;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author yefamao
 * @Date 2021/3/23 19:04
 */
//@Mapper
@Transactional(rollbackFor = {Exception.class,Error.class})
public interface ItemDao{

    //@Select("select * from item where id = #{id}")
    Item findById(int id);
    @Insert("insert into item values(#{id},#{name},#{price},#{createtime},#{detail})")
    void saveItem(Item item);
}

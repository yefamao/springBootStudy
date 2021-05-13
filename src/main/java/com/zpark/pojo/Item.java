package com.zpark.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author yefamao
 * @Date 2021/3/10 21:07
 */
//@Component  //@Component注解表明一个类会作为组件类，并告知Spring要为这个类创建bean
//@Bean             //注解告诉Spring这个方法将会返回一个对象，这个对象要注册为Spring应用上下文中的bean
@Data                //lombok
@NoArgsConstructor  //自动生成无参数构造函数。
@AllArgsConstructor //自动生成全参数构造函数
public class Item implements Serializable {
    private Integer id;
    private String name;
    private long price;
    private Date createtime;
    private String detail;
}

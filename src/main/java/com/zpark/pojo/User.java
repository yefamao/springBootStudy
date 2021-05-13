package com.zpark.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author yefamao
 * @Date 2021/3/25 8:39
 */
@Data                //lombok
@NoArgsConstructor  //自动生成无参数构造函数。
@AllArgsConstructor //自动生成全参数构造函数
@Table(name="tb_user")
public class User implements Serializable {
    //id
    @Id
    private Long id;
    // 用户名
    private String userName;
    //密码
    private String password;
    // 姓 名
    private String name;
    // 年 龄
    private Integer age;
    // 性别，1男性，2女性
    private Integer sex;
    // 出生日期
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "CTT")
    private Date birthday;
    // 创建时间
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "CTT")
    private Date created;
    // 更新时间
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "CTT")
    private Date updated;
    // 备 注
    private String note;

}

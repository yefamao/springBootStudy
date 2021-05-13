package com.zpark.controller;

import com.zpark.pojo.User;
import com.zpark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @Author yefamao
 * @Date 2021/3/25 8:47
 */

@Controller
public class UserController {

    @Autowired
    UserService userService;

    // 根据ID查询信息
    @GetMapping("/findById/{id}")
    public String UserFindById(@PathVariable("id") int id, Model model) {
        User users =userService.findById(id);
        model.addAttribute("msg","根据ID查询到的信息:");
        model.addAttribute("users",users);
        return "showUsers";
    }


    // 查询所有用户信息
    @GetMapping("/showUsers")
    public String FindAllUser(Model model) {
        List<User> users =userService.findAll();
        model.addAttribute("msg","所有的用户信息:");
        model.addAttribute("users",users);
        return "showUsers";
    }

    // 跳转到用户信息添加页面
    @GetMapping("/insertUser")
    public String insertUser() {
        return "addUser";
    }
    // 添加一个用户信息
    @PostMapping("/addUser")
    public String insertUser(User user,Model model) {
        user.setCreated(new Date());
        user.setUpdated(new Date());
        int flag =userService.insertUser(user);
        if(flag>0){
            model.addAttribute("msg","添加用户信息成功");
            return "redirect:/showUsers";
        }else {
            model.addAttribute("msg","添加用户信息失败");
            return "error";
        }
    }


    // 删除一个用户信息
    @RequestMapping("delById")
    public String delById(@RequestParam("id") int id,Model model){
        int flag = userService.delete(id);
        if(flag>0){
            return "forward:/showUsers";
        }else {
            model.addAttribute("msg","删除用户信息失败");
            return "error";
        }
    }

    // 跳转到修改用户信息页面
    @RequestMapping("updateById")
    public String updateUser(@RequestParam("id") int id,Model model){
        User users =userService.findById(id);
        model.addAttribute("users",users);
        return "updateUser";
    }

    // 修改用户信息
    @RequestMapping("/updateUser")
    public String updateUser(User user,Model model){
        user.setCreated(new Date());
        user.setUpdated(new Date());
        int flag =userService.update(user);
        if(flag>0){
            return "redirect:/showUsers";
        }else {
            model.addAttribute("msg","修改用户信息失败");
            return "error";
        }
    }
}

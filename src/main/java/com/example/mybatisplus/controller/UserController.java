package com.example.mybatisplus.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.entity.User;
import com.example.mybatisplus.servie.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    // 根据id获取用户信息
    @GetMapping("{id}")
    public User getById(@PathVariable int id) {
        return userService.getUserInfoById(id);
    }

    // 根据昵称获取用户列表(自定义sql)
    @GetMapping("name")
    public List<Map> getByName(String name) {
        System.out.println(name);
        return userService.getUserInfoByName(name);
    }

    // 根据条件获取用户列表
    @GetMapping("info")
    public List<User> getUserList(Integer sex, Integer credit) {
        System.out.println(sex);
        System.out.println(credit);
        return userService.getUserList(sex, credit);
    }

    // 获取用户信息带分页（自定义sql）
    @GetMapping("info/page")
    public List<User> getUserListForPage(HttpServletRequest request) {
        String sex = request.getParameter("sex");
        String credit = request.getParameter("credit");
        System.out.println("sex is:" + sex);
        System.out.println("credit is:" + credit);
        Page<User> page = new Page<>(1, 10);
        return userService.getUserListForPage(Integer.parseInt(sex), Integer.parseInt(credit), page);
    }

    // 获取用户租房信息（自定义多表查询sql）
    @GetMapping("house")
    public List<Map> getUserHouse(Integer id) {
        return userService.getUserHouse(id);
    }

    // 保存用户信息
    @PostMapping("save")
    public String saveUserInfo(@RequestBody User userInfo) {
        System.out.println(userInfo);
//        User userInfo = new User();
        int r = userService.saveUserInfo(userInfo);
        System.out.println(r);
        return "ok";
    }

    // 更新用户信息
    @PutMapping("update")
    public String updateUserInfo(@RequestBody User user) {
        System.out.println(user);
        userService.updateUserInfo(user);
        return "ok";
    }

    // 删除用户信息
    @DeleteMapping("{uid}")
    public String deleteUserInfo(@PathVariable int uid) {
        System.out.println(uid);
        userService.deleteUserInfo(uid);
        return "ok";
    }
}

package com.example.mybatisplus.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.entity.User;
import com.example.mybatisplus.servie.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User getById(@PathVariable int id) {
        return userService.getUserInfoById(id);
    }

    @GetMapping("info")
    public List<User> getUserList(Integer sex, Integer credit) {
        System.out.println(sex);
        System.out.println(credit);
        return userService.getUserList(sex, credit);
    }

    @GetMapping("info/page")
    public List<User> getUserListForPage(HttpServletRequest request) {
        String sex = request.getParameter("sex");
        String credit = request.getParameter("credit");
        System.out.println("sex is:" + sex);
        System.out.println("credit is:" + credit);
        Page<User> page = new Page<>(1, 10);
        return userService.getUserListForPage(Integer.parseInt(sex), Integer.parseInt(credit), page);
    }

    @PostMapping("save")
    public String saveUserInfo(@RequestBody User userInfo) {
        System.out.println(userInfo);
//        User userInfo = new User();
        int r = userService.saveUserInfo(userInfo);
        System.out.println(r);
        return "ok";
    }

    @PutMapping("update")
    public String updateUserInfo(@RequestBody User user) {
        System.out.println(user);
        userService.updateUserInfo(user);
        return "ok";
    }

    @DeleteMapping("{uid}")
    public String deleteUserInfo(@PathVariable int uid) {
        System.out.println(uid);
        userService.deleteUserInfo(uid);
        return "ok";
    }
}

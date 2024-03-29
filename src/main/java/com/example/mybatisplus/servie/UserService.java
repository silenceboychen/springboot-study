package com.example.mybatisplus.servie;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    // 通过用户id获取用户信息
    User getUserInfoById(Integer id);
    // 保存用户信息
    int saveUserInfo(User user);
    // 更新用户信息
    void updateUserInfo(User user);
    // 删除用户信息
    void deleteUserInfo(Integer uid);
    // 查询用户列表， where条件
    List<User> getUserList(Integer sex, Integer credit);
    // 通过用户昵称获取用户列表(自定义sql)
    List<Map> getUserInfoByName(String nickname);
    // 查询用户列表带分页(自定义sql)
    List<User> getUserListForPage(Integer sex, Integer credit, Page<User> page);
    // 获取用户租房信息（自定义多表查询sql）
    List<Map> getUserHouse(Integer id);
}

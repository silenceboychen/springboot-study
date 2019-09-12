package com.example.mybatisplus.servie;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 保存
     */
    User getUserInfoById(Integer id);

    int saveUserInfo(User user);

    void updateUserInfo(User user);

    void deleteUserInfo(Integer uid);

    List<User> getUserList(Integer sex, Integer credit);

    List<User> getUserListForPage(Integer sex, Integer credit, Page<User> page);
}

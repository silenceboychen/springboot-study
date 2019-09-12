package com.example.mybatisplus.servie.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.entity.User;
import com.example.mybatisplus.mapper.UserMapper;
import com.example.mybatisplus.servie.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public User getUserInfoById(Integer id) {
        User userInfo = userMapper.selectById(id);
        return userInfo;
    }

    @Override
    public List<User> getUserInfoByName(String nickname) {
        List<User> userInfo = userMapper.selectByName(nickname);
        return userInfo;
    }

    @Override
    public int saveUserInfo(User user) {
        int r = userMapper.insert(user);
        return r;
    }

    @Override
    public void updateUserInfo(User user) {
        int r = userMapper.updateById(user);
        System.out.println(r);
    }

    @Override
    public void deleteUserInfo(Integer uid) {
        int r = userMapper.deleteById(uid);
        System.out.println(r);
    }

    @Override
    public List<User> getUserList(Integer sex, Integer credit) {
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("sex", sex);
        userMap.put("credit", credit);
        List<User> userList = userMapper.selectByMap(userMap);
        return userList;
    }

    @Override
    public List<User> getUserListForPage(Integer sex, Integer credit, Page<User> page) {
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("sex", sex);
        userMap.put("credit", credit);
//        List<User> userList = userMapper.selectByMap(userMap);
//        return userList;
        return userMapper.selectUserListPage(page);
    }
}

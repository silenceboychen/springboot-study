package com.example.mybatisplus.servie.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.mybatisplus.mapper.UserHouseMapper;
import com.example.mybatisplus.servie.UserHouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserHouseServiceImpl implements UserHouseService {
    @Resource
    UserHouseMapper userHouseMapper;

    @Override
    public IPage<Map> getUserHouseWithPage(IPage iPage, Integer id) {
        return userHouseMapper.selectUserHouseWithPage(iPage, id);
    }
}

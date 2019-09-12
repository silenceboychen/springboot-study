package com.example.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.mybatisplus.entity.UserHouse;

import java.util.List;
import java.util.Map;

public interface UserHouseMapper extends BaseMapper<UserHouse> {
    IPage<Map> selectUserHouseWithPage(IPage iPage, Integer id);
}

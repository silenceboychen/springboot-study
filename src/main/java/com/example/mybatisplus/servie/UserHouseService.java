package com.example.mybatisplus.servie;

import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;
import java.util.Map;

public interface UserHouseService {
    // 获取用户租房信息带分页（自定义多表查询sql）
    IPage<Map> getUserHouseWithPage(IPage iPage, Integer id);
}

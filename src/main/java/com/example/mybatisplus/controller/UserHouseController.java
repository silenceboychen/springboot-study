package com.example.mybatisplus.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.servie.UserHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("house")
public class UserHouseController {
    @Autowired
    UserHouseService userHouseService;

    @GetMapping("list")
    public IPage<Map> getUserHouseWithPage (Integer id) {
        IPage<Map> iPage = new Page<>(1, 2);
        return userHouseService.getUserHouseWithPage(iPage, id);
    }
}

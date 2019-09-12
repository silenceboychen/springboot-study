package com.example.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("tbl_user")
@SuppressWarnings("all")
public class User implements Serializable {
    @TableId( value = "id", type = IdType.AUTO)
    private Integer id;
    private String nickname;
    private String avatar;
    private Integer sex;
    private String openid;
    private String unionid;
    private Integer credit;
    @TableField("create_time")
    private Integer createTime;
    @TableField("update_time")
    private Integer updateTime;
}

package com.example.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tbl_user_house")
public class UserHouse {
    @TableId( value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("user_id")
    private Integer userId;
    private Integer kind;
    @TableField("arrive_time")
    private Integer arriveTime;
    @TableField("leave_time")
    private Integer leaveTime;
    @TableField("charge_way")
    private Integer chargeWay;
    @TableField("need_pay")
    private Integer needPay;
    @TableField("sex_requirement")
    private Integer sexRequirement;
    @TableField("accommodation_type")
    private Integer accommodationType;
    private String purpose;
    private String note;
    private String phone;
    private Double longitude;
    private Double latitude;
    @TableField("detail_address")
    private String detailAddress;
    private String photo;
    private Integer status;
    @TableField("view_num")
    private Integer viewNum;
    @TableField("create_time")
    private Integer createTime;
    @TableField("create_time")
    private Integer updateTime;
    private String geohash;
    @TableField("is_active")
    private Integer isActive;
    @TableField("transaction_id")
    private String transactionId;

}

package com.example.shardingJdbcDemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Castle
 * @Date 2021/4/26 8:49
 */
@Data
@TableName("t_user")
public class User {
    private Long uid;
    private String uname;
}

package com.example.shardingJdbcDemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Castle
 * @Date 2021/4/26 9:13
 */
@Data
@TableName("t_dict")
public class Dict {
    private Long tid;
    private String tname;
}

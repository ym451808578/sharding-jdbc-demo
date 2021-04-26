package com.example.shardingJdbcDemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Castle
 * @Date 2021/4/25 15:01
 */
@Data
@TableName("t_order")
public class Order {
    private Long oid;
    private String comment;
    private Long userId;
}

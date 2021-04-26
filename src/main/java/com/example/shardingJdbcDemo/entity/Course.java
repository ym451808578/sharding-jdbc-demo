package com.example.shardingJdbcDemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Castle
 * @Date 2021/4/26 9:49
 */
@Data
@TableName("t_course")
public class Course {
    private Long id;
    private String name;
}

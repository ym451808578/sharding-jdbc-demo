package com.example.shardingJdbcDemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shardingJdbcDemo.entity.Course;
import org.springframework.stereotype.Repository;

/**
 * @author Castle
 * @Date 2021/4/26 9:50
 */
@Repository
public interface CourseMapper extends BaseMapper<Course> {
}

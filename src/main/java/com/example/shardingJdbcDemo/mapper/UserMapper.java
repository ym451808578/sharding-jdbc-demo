package com.example.shardingJdbcDemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shardingJdbcDemo.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author Castle
 * @Date 2021/4/26 8:50
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}

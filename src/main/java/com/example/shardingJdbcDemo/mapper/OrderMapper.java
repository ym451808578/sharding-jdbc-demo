package com.example.shardingJdbcDemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shardingJdbcDemo.entity.Order;
import org.springframework.stereotype.Repository;

/**
 * @author Castle
 * @Date 2021/4/25 15:07
 */
@Repository
public interface OrderMapper extends BaseMapper<Order> {
}

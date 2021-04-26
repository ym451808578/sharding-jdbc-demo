package com.example.shardingJdbcDemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.shardingJdbcDemo.entity.Course;
import com.example.shardingJdbcDemo.entity.Dict;
import com.example.shardingJdbcDemo.entity.Order;
import com.example.shardingJdbcDemo.entity.User;
import com.example.shardingJdbcDemo.mapper.CourseMapper;
import com.example.shardingJdbcDemo.mapper.DictMapper;
import com.example.shardingJdbcDemo.mapper.OrderMapper;
import com.example.shardingJdbcDemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.transform.Source;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class ShardingJdbcDemoApplicationTests {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DictMapper dictMapper;

    @Autowired
    private CourseMapper courseMapper;

    /**
     * 测试添加订单
     */
    @Test
    public void addOrder() {
        for (int i = 1; i <= 10; i++) {
            Order order = new Order();
            //order.setOid((long) i);
            order.setComment("course" + i);
            order.setUserId((long) i);
            orderMapper.insert(order);
        }
    }

    /**
     * 测试查询订单
     */
    @Test
    public void getOrders() {
        List<Order> orders = orderMapper.selectList(null);
        System.out.println(orders.size());
    }

    /**
     * 测试添加用户
     */
    @Test
    public void addUser() {
        for (int i = 1; i <= 10; i++) {
            User user = new User();
            user.setUid((long) i);
            user.setUname("user" + i);
            userMapper.insert(user);
        }
    }

    /**
     * 测试添加字典
     */
    @Test
    public void addDict() {
        for (int i = 1; i <= 10; i++) {
            Dict dict = new Dict();
            dict.setTid((long) i);
            dict.setTname("name" + i);
            dictMapper.insert(dict);
        }
    }

    /**
     * 测试添加课程
     */
    @Test
    public void addCourse() {
        for (int i = 5; i <= 10; i++) {
            Course course = new Course();
            course.setId((long) i);
            course.setName("name" + i);
            courseMapper.insert(course);
        }
    }

    /**
     * 测试获取课程
     */
    @Test
    public void getCourse() {
        QueryWrapper<Course> wrapper = new QueryWrapper<>();
        wrapper.eq("id", 1L);
        List<Course> courses = courseMapper.selectList(wrapper);
        System.out.println(courses.get(0));
    }
}

package com.athw.mybatis;

import com.athw.mybatis.bean.User;
import com.athw.mybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MybatisPlusApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList(){
        System.out.println(("-----------selectAll method test----------"));

        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);

    }
}

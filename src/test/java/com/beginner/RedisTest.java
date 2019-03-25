package com.beginner;

import com.beginner.dao.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    RedisDao redisDao;
    @Test
    public void testRedis(){
        redisDao.setKey("name","lsz");
        redisDao.setKey("age","27");
        System.out.println(redisDao.getValue("name"));
        System.out.println(redisDao.getValue("age"));
    }


}

package com.beginner.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

/**
 * Repository 来注入SpringIOC容器
 * RedisTemplate 用来访问Redis，通过注入StringRedisTemplate的Bean来操作redis数据库
 */
@Repository
public class RedisDao {
    @Autowired
    private StringRedisTemplate template;
    public void setKey(String key,String value){
        ValueOperations<String,String> ops = template.opsForValue();
        ops.set(key,value,1, TimeUnit.MINUTES);
    }
    public String getValue(String key){
        ValueOperations<String,String> ops = template.opsForValue();
        return ops.get(key);
    }
}

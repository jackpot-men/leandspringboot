package com.beginner.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * ConfigurationProperties注解 表明该类是属性配置类，并加上配置的prefix = my
 * Component注解，springboot在启动时通过包扫描将该类作为一个bean注入到IOC中
 */
@ConfigurationProperties(prefix = "my")
@Component
public class MyEntity {
    private String name ;
    private int age;
    private String greeting;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}

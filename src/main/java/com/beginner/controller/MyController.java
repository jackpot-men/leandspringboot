package com.beginner.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 配置参数赋值
 */
@RestController
public class MyController {
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;

    @RequestMapping(value = "/my")
    public String my(){
        return "姓名："+name +"，年龄："+ age;
    }
}

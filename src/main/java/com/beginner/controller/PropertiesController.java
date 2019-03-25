package com.beginner.controller;

import com.beginner.entity.MyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {
    @Autowired
    MyEntity myEntity;

    @RequestMapping(value = "/myProperties")
    public String my(){
        return myEntity.getName()+":"+myEntity.getAge()+"."+myEntity.getGreeting();
    }
}

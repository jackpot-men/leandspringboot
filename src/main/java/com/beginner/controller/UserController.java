package com.beginner.controller;

import com.beginner.dao.RedisDao;
import com.beginner.entity.UserEntity;
import com.beginner.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/{userName}")
    public UserEntity getUser(@PathVariable("userName")String username){
        return  userService.findUserByName(username);
    }
    @ApiOperation(value="用户列表",notes ="用户列表")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<UserEntity> getUsers(){
        List<UserEntity> users = userService.findAll();
        return users;
    }


    //测试redis过期
    //@Autowired
    //RedisDao redisDao;
   /* @RequestMapping(value = "/redisTest")
    public void getRedisKey(){
        //往redis写入一个key
        new Thread(){
            public void run(){
                redisDao.setKey("timeKey","1分钟");
                System.out.println("添加key:timeKey:"+redisDao.getValue("timeKey"));
            }
        }.start();

        //第二个线程 等30秒去读取key
        new Thread(){
            public void run(){
                try {
                    System.out.println("创建线程2，休眠30秒后执行");
                    this.sleep(30000);
                    System.out.println("30s后，key值为："+redisDao.getValue("timeKey"));
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }.start();
        //第三个线程 等61秒去读取key
        new Thread(){
            public void run(){
                try {
                    System.out.println("创建线程3，休眠60秒后执行");
                    this.sleep(61000);
                    System.out.println("60s后，key值为："+redisDao.getValue("timeKey"));
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }.start();
    }*/
}

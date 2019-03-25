package com.beginner.service;

import com.beginner.dao.UserDao;
import com.beginner.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserDao userRepository;

    public UserEntity findUserByName(String username){
        return userRepository.findByUsername(username);
    }
    //查询全部用户信息
    public List<UserEntity> findAll(){
        return userRepository.findAll();
    }

    //保存一个用户
    public UserEntity saveUser(UserEntity userEntity){
        return userRepository.save(userEntity);
    }

    public UserEntity updateUser(UserEntity userEntity){
        return userRepository.saveAndFlush(userEntity);
    }

    public void deleteUser(long id){
        userRepository.deleteById(id);
    }

}

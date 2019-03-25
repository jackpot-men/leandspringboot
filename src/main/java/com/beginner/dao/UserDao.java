package com.beginner.dao;

import com.beginner.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserEntity,Long> {
    UserEntity findByUsername(String username);
}

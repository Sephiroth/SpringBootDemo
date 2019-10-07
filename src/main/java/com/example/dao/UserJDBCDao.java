package com.example.dao;

import com.example.Model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class UserJDBCDao {
    @Resource // 自动注册
    private JdbcTemplate jdbc;

    public void addUser(User user){
        // insert,update,delete逗使用Update方法
        jdbc.update("INSERT INTO user (username,password,email,sex,) VALUES (?,?,?,?)",
                user.getUsername(),
                user.getPassword(),
                user.getEmail(),
                user.getSex());
    }
}

package com.example.ServiceImpl;

import com.example.Model.User;
import com.example.Service.UserService;
import com.example.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper dao;
    //private UserJDBCDao dao;

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public User getUser(String username) {
        return null;
    }

    @Override
    public List<User> getUserList(String sex) {
        return null;
    }

    @Override
    public int addUser(User user) {
        return dao.insert(user);
    }

    @Override
    public void deleteUser(int id) {
    }

    @Override
    public void ModifyUser(User user) {
    }
}

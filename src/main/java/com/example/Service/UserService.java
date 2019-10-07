package com.example.Service;

import com.example.Model.User;
import java.util.List;


public interface UserService {
    User getUser(int id);

    User getUser(String username);

    List<User> getUserList(String sex);

    int addUser(User user);

    void deleteUser(int id);

    void ModifyUser(User user);
}

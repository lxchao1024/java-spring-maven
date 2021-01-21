package com.example.demo.services;

import com.example.demo.dao.UserDAO;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public boolean isExist(String name) {
        User user = getByName(name);
        return null!=user;
    }

    public User getByName(String name) {
        return userDAO.findByUsername(name);
    }

    public User get(String name, String pwd){
        return userDAO.getByUsernameAndPassword(name, pwd);
    }

    public void add(User user) {
        userDAO.save(user);
    }
}

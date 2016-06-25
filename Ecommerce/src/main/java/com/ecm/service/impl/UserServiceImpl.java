package com.ecm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecm.dao.UserDao;
import com.ecm.model.User;
import com.ecm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    @Override
    public int register(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.userLogin(user);
    }

}

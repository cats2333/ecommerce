package com.ecm.service;

import com.ecm.model.User;

public interface UserService {

    public User getUserById(int userId);

    public int register(User user);

    public User login(User user);
    }

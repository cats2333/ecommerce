package com.ecm.dao;

import com.ecm.model.User;

public interface UserDao {
    public User selectByPrimaryKey(int userid);

    public int saveUser(User user);

    public User userLogin(User user);
   }

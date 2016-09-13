package com.mw.consumer.service;

import com.mw.consumer.domain.User;

/**
 * Created by wei.ma on 2016/9/2.
 */
public interface IUserService {

    User getUserById(int id);

    long insertUser(User user);

    long updateUser(User user);
}


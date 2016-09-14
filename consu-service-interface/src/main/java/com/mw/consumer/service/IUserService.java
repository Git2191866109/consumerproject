package com.mw.consumer.service;

import com.mw.consumer.domain.User;

import java.util.List;

/**
 * Created by wei.ma on 2016/9/2.
 */
public interface IUserService {
    /**
     * 查询一个用户
     *
     * @param id
     * @return
     */
    User getUserById(int id);

    /**
     * 插入一个用户
     *
     * @param user
     * @return
     */
    long insertUser(User user);

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    long updateUser(User user);

    /**
     * 查询所有的用户
     */
    List<User> getAll();


}


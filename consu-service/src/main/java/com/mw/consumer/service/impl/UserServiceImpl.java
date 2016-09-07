package com.mw.consumer.service.impl;

import com.mw.consumer.dao.interfaces.IUserDao;
import com.mw.consumer.domain.User;
import com.mw.consumer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wei.ma on 2016/9/2.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao iUserDao;

    @Override
    public User getUserById(int id) {
        return iUserDao.getById(id);
    }

    @Override
    public long insertUser(User user) {
        return iUserDao.insert(user);
    }

}

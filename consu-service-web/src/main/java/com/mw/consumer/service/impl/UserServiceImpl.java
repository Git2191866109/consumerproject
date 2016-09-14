package com.mw.consumer.service.impl;

import com.mw.consumer.dao.interfaces.IUserDao;
import com.mw.consumer.domain.User;
import com.mw.consumer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by wei.ma on 2016/9/2.
 */
@Service("userService")
@Transactional
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

    @Override
    public long updateUser(User user) {
        return iUserDao.update(user);
    }

    @Override
    public List<User> getAll() {
        return iUserDao.getAll();
    }

}

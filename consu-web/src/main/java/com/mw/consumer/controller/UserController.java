package com.mw.consumer.controller;

import com.mw.consumer.domain.User;
import com.mw.consumer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wei.ma on 2016/9/7.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User view(@PathVariable("id") Integer id) {
        User user = new User();
        user =userService.getUserById(id);
        return user;
    }
}

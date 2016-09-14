package com.mw.consumer.controller;

import com.mw.consumer.domain.User;
import com.mw.consumer.service.IUserService;
import com.mw.consumer.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by wei.ma on 2016/9/7.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    public String getAllUsers(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<User> userList = userService.getAll();
        if (!CollectionUtils.isEmpty(userList)) {
            request.setAttribute("userList", userList);
        }
        return "/user";

    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String saveUser(HttpServletRequest request, HttpServletResponse response, Integer userId, String name,
                           Double cost_morning, Double cost_noon, Double cost_afternoon) throws Exception {
        User user = new User();
        user.setUserId(userId);
        user.setCost_morning(cost_morning);
        user.setCost_noon(cost_noon);
        user.setCost_afternoon(cost_afternoon);
        user.setDate(DateUtils.getToday());
        long result = userService.insertUser(user);
        if (result > 0) {
            return "/user";
        } else {
            return "/user";
        }
    }
}

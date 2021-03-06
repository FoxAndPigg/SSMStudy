package org.gosky.ssmstudy.controller;

import org.gosky.ssmstudy.domain.User;
import org.gosky.ssmstudy.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by guozhong on 17/3/3.
 */
@Controller()
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public void register(User user) {
        System.out.println(user.toString());
        userService.add(user);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public User get(String loginId){
        return userService.get(loginId);
    }




}

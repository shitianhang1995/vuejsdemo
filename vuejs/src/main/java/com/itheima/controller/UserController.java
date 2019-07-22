package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: root
 * @Date: 2019/7/22 18:35
 * @Description:
 */
@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/findAll")
    public List<User> findAll() {
        System.out.println("test");
        return userService.findAll();
    }

    @RequestMapping(value = "/findById")
    public User findById(Integer id) {
        System.out.println("findById");
        return userService.findById(id);
    }

    @RequestMapping(value = "/updateUser")
    public void updateUser(@RequestBody User user) {
        System.out.println("updateUser");
        userService.updateUser(user);
    }
}

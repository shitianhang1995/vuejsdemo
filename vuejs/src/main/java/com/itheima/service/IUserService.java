package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

/**
 * @Auther: root
 * @Date: 2019/7/22 18:13
 * @Description:
 */
public interface IUserService {

    List<User> findAll();

    User findById(Integer userId);

    void updateUser(User user);
}

package com.whut.wedding.service.impl;

import com.whut.wedding.dao.UserDao;
import com.whut.wedding.entity.User;
import com.whut.wedding.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@DubboService(version = "1.0.0")
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User login(String username, String password) {
        return userDao.login(username, password);
    }

    @Override
    public void register(String username, String password) {
        userDao.register(username, password);
    }

    @Override
    public User selectUserByTel(String username) {
        return userDao.selectUserByTel(username);
    }
}
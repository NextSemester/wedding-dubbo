package com.whut.wedding.dao;

import com.whut.wedding.entity.User;

public interface UserDao {
    /*
    登录
     */
    User login(String username, String password);

    /**
     * 用户注册
     * @param username
     * @param password
     */
    void register(String username, String password);

    /**
     * 通过手机号查询用户
     * @param username
     * @return
     */
    User selectUserByTel(String username);


}

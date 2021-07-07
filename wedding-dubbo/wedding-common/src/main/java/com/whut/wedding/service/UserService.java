package com.whut.wedding.service;

import com.whut.wedding.entity.User;

public interface UserService {
    User login(String username, String password);
    void register(String username, String password);
    User selectUserByTel(String username);
}

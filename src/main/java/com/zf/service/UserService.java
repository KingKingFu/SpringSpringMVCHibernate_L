package com.zf.service;

import com.zf.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2016/12/29.
 */
public interface UserService {
    Integer register(User user);
    User login(String uname, String upass);
    List<User> findllUser();
    void updateUser(int id, User user);
    void deleteUser(int id);
}

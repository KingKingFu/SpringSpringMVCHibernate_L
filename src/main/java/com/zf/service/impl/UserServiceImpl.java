package com.zf.service.impl;

import com.zf.dao.UserDao;
import com.zf.entity.User;
import com.zf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public User login(String uname, String upass) {
        return userDao.selectUser(uname,upass);
    }

    @Override
    public List<User> findllUser() {
        return userDao.selectAllUser();
    }

    @Override
    public void updateUser(int id, User user) {
        userDao.updateUser(id,user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}

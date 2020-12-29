package com.ssm.service.impl;

import com.ssm.dao.UserDao;
import com.ssm.domain.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author xxc
 * @Date 2020/12/29 11:15
 * @Description TODO
 */
@Service
//@Transactional
public class UserServiceImpl implements UserService {

//    @Autowired
    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findById(int userId) {
        return userDao.findById(userId);
    }
}

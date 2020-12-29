package com.ssm.dao;

import com.ssm.domain.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author xxc
 * @Date 2020/12/29 10:52
 * @Description TODO
 */
public class UserDaoTest {

    @Test
    public void testFindById() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = context.getBean(UserDao.class);
        User user = userDao.findById(4);
        System.out.println(user);
    }

}

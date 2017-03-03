package org.gosky.ssmstudy.service.serviceImpl;

import org.gosky.ssmstudy.dao.UserDao;
import org.gosky.ssmstudy.domain.User;
import org.gosky.ssmstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by guozhong on 17/3/3.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public void add(User user) {
        int result = 0; //受影响的行数默认为0
        result = userDao.add(user);
        System.out.println("result" + result);
    }
}
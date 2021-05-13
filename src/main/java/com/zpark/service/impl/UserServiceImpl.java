package com.zpark.service.impl;

import com.zpark.dao.UserDao;
import com.zpark.pojo.User;
import com.zpark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author yefamao
 * @Date 2021/3/25 9:21
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.selectAll();
    }

    @Override
    public int insertUser(User user) {
       return userDao.insert(user);
    }

    @Override
    public User findById(int id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public int delete(int id) {
        return userDao.deleteByPrimaryKey(id);
    }

    @Override
    public int update(User user) {
        return userDao.updateByPrimaryKey(user);
    }

}

package com.zpark.service;

import com.zpark.pojo.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    int insertUser(User user);

    User findById(int id);

    int delete(int id);

    int update(User user);
}

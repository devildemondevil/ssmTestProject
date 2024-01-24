package com.jsz.service.impl;

import com.jsz.dao.UserMapper;
import com.jsz.pojo.User;
import com.jsz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

//    @Autowired
//    private UserMapper userMapper;
    @Override
    public List<User> selectAll() {
//        return userMapper.selectAll();
    return null;
    }
}

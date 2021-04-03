package edu.system.serve.service.Impl;

import edu.system.serve.mapper.UserMapper;
import edu.system.serve.pojo.student.User;
import edu.system.serve.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    // 将DAO注入Service层
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> queryUser(String username, String password) {
        return userMapper.queryUser(username, password);
    }
}

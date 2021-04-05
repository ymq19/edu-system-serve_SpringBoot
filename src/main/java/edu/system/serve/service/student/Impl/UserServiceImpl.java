package edu.system.serve.service.student.Impl;

import edu.system.serve.mapper.student.UserMapper;
import edu.system.serve.pojo.student.User;
import edu.system.serve.service.TokenService;
import edu.system.serve.service.student.UserService;
import edu.system.serve.utils.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    // 将DAO注入Service层
    @Autowired
    UserMapper userMapper;

    @Autowired
    TokenService tokenService;

    @Override
    public Map<String, Object> queryUser(String username, String password) {
        List<User> userList = userMapper.queryUser(username, password);
        Map<String, Object> map = new HashMap<>();

        // 查询到登录有该账号
        if (userList.size() != 0) {
            map.put("name", userList.get(0).getName());
            map.put("url", userList.get(0).getAvatar());
            map.put("status", StatusCode.SUCCESS_CODE);
            map.put("token", tokenService.getToken());
        } else {
            map.put("status", StatusCode.ERROR_CODE);
            map.put("message", "用户名或密码错误");
        }
        return map;
    }
}

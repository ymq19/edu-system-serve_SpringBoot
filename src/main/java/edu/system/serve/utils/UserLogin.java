package edu.system.serve.utils;

import edu.system.serve.pojo.student.User;
import edu.system.serve.service.TokenService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserLogin {

    public Map<String, Object> login(List<User> userList) {
        TokenService tokenService = new TokenService();
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

package edu.system.serve.utils;

import com.alibaba.fastjson.JSON;
import edu.system.serve.mapper.BaseUserMapper;
import edu.system.serve.pojo.student.User;
import edu.system.serve.service.TokenService;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserLogin<T extends BaseUserMapper>{

    private final T userMapper;

    public UserLogin(T userMapper) {
        this.userMapper = userMapper;
    }

    // 登录验证
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

    // 密码验证
    public Map<String, Object> passwordValid(String username, String passwordSet) {
        Map<String, String> map = JSON.parseObject(passwordSet, Map.class);
        System.out.println(map);
        System.out.println(userMapper);
        // 密码是否输入正确
        if (userMapper.queryUser(username, map.get("oldPassword")).size() != 0) {
            userMapper.updatePassword(username, map.get("password"));
            Map<String, Object> stringMap = new HashMap<>();

            stringMap.put("status", StatusCode.SUCCESS_CODE);
            return stringMap;
        }

        Map<String, Object> stringMap = new HashMap<>();
        stringMap.put("status", StatusCode.ERROR_CODE);

        return stringMap;
    }

    // 添加头像/修改头像
    public Map<String, String> addAvatar(String username, MultipartFile imgUrl) {
        FileUpload fileUpload = new FileUpload(imgUrl);
        Map<String, String> map = new HashMap<>();
        String fileUrl = fileUpload.upload();

        userMapper.addAvatar(username, fileUrl);
        map.put("url", fileUrl);
        return map;
    }
}

package edu.system.serve.service.student.Impl;

import com.alibaba.fastjson.JSON;
import edu.system.serve.mapper.student.UserMapper;
import edu.system.serve.pojo.student.User;
import edu.system.serve.service.TokenService;
import edu.system.serve.service.student.UserService;
import edu.system.serve.utils.FileUpload;
import edu.system.serve.utils.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

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

    @Override
    public Map<String, String> addAvatar(String username, MultipartFile imgUrl) {
        FileUpload fileUpload = new FileUpload(imgUrl);
        Map<String, String> map = new HashMap<>();
        String fileUrl = fileUpload.upload();

        userMapper.addAvatar(username, fileUrl);
        map.put("url", fileUrl);
        return map;
    }

    @Override
    public void updateProfile(String sno, String data) {
        Map<String, String> map = JSON.parseObject(data, Map.class);
        userMapper.updateProfile(sno, map);

    }

    @Transactional
    @Override
    public Map<String, Object> updatePassword(String username, String passwordSet) {
        Map<String, String> map = JSON.parseObject(passwordSet, Map.class);
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
}

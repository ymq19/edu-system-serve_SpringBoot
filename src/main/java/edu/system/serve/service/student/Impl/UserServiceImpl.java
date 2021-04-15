package edu.system.serve.service.student.Impl;

import com.alibaba.fastjson.JSON;
import edu.system.serve.mapper.student.UserMapper;
import edu.system.serve.pojo.student.User;
import edu.system.serve.service.TokenService;
import edu.system.serve.service.student.UserService;
import edu.system.serve.utils.FileUpload;
import edu.system.serve.utils.StatusCode;
import edu.system.serve.utils.UserLogin;
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

    @Override
    public Map<String, Object> queryUser(String username, String password) {
        List<User> userList = userMapper.queryUser(username, password);

        UserLogin<UserMapper> userLogin = new UserLogin<>(userMapper);
        return userLogin.login(userList);
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

    @Transactional
    @Override
    public Map<String, Object> updatePassword(String username, String passwordSet) {
        UserLogin<UserMapper> userLogin = new UserLogin<>(userMapper);

        return userLogin.passwordValid(username, passwordSet);
    }
}

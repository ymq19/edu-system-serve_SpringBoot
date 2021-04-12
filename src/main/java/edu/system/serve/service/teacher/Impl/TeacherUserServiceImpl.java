package edu.system.serve.service.teacher.Impl;

import edu.system.serve.mapper.teacher.TeacherUserMapper;
import edu.system.serve.pojo.student.User;
import edu.system.serve.service.teacher.TeacherUserService;
import edu.system.serve.utils.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
class TeacherUserServiceImpl implements TeacherUserService {

    @Autowired
    TeacherUserMapper userMapper;


    @Override
    public Map<String, Object> queryUser(String username, String password) {
        List<User> userList = userMapper.queryUser(username, password);

        UserLogin userLogin = new UserLogin();
        return userLogin.login(userList);
    }
}

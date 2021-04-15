package edu.system.serve.service.teacher.Impl;

import edu.system.serve.mapper.teacher.TeacherUserMapper;
import edu.system.serve.mapper.teacher.TeacherUserMapper;
import edu.system.serve.pojo.student.User;
import edu.system.serve.service.teacher.TeacherUserService;
import edu.system.serve.utils.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Service
public
class TeacherUserServiceImpl implements TeacherUserService {

    @Autowired
    TeacherUserMapper userMapper;


    @Override
    public Map<String, Object> queryUser(String username, String password) {
        List<User> userList = userMapper.queryUser(username, password);

        UserLogin<TeacherUserMapper> userLogin = new UserLogin<>(userMapper);
        return userLogin.login(userList);
    }

    @Transactional
    @Override
    public Map<String, String> addAvatar(String username, MultipartFile imgUrl) {
        UserLogin<TeacherUserMapper> userLogin = new UserLogin<>(userMapper);

        return userLogin.addAvatar(username, imgUrl);
    }

    @Transactional
    @Override
    public Map<String, Object> updatePassword(String username, String passwordSet) {
        UserLogin<TeacherUserMapper> userLogin = new UserLogin<>(userMapper);

        return userLogin.passwordValid(username, passwordSet);
    }


}

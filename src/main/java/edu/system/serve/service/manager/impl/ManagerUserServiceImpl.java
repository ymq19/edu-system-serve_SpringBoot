package edu.system.serve.service.manager.impl;

import edu.system.serve.mapper.manager.ManagerUserMapper;
import edu.system.serve.mapper.teacher.TeacherUserMapper;
import edu.system.serve.pojo.student.User;
import edu.system.serve.service.manager.ManagerUserService;
import edu.system.serve.utils.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Service
public class ManagerUserServiceImpl implements ManagerUserService {

    @Autowired
    private ManagerUserMapper managerUserMapper;

    @Override
    public Map<String, Object> queryUser(String username, String password) {
        List<User> userList = managerUserMapper.queryUser(username, password);

        UserLogin<ManagerUserMapper> userLogin = new UserLogin<>(managerUserMapper);
        return userLogin.login(userList);
    }

    @Override
    public Map<String, Object> updatePassword(String username, String passwordSet) {
        UserLogin<ManagerUserMapper> userLogin = new UserLogin<>(managerUserMapper);

        return userLogin.passwordValid(username, passwordSet);
    }

    @Override
    public Map<String, String> addAvatar(String username, MultipartFile imgUrl) {
        UserLogin<ManagerUserMapper> userLogin = new UserLogin<>(managerUserMapper);

        return userLogin.addAvatar(username, imgUrl);
    }
}

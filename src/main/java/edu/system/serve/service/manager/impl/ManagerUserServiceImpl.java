package edu.system.serve.service.manager.impl;

import edu.system.serve.mapper.manager.ManagerUserMapper;
import edu.system.serve.mapper.teacher.TeacherUserMapper;
import edu.system.serve.pojo.student.User;
import edu.system.serve.service.manager.ManagerUserService;
import edu.system.serve.utils.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
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

    @Override
    public Map<String, List<User>> queryStudent(String limitNum) {
        Map<String, List<User>> map = new HashMap<>();

        map.put("result", managerUserMapper.queryStudent(Integer.parseInt(limitNum)));
        return map;
    }

    @Override
    public Map<String, List<User>> queryTeacher(String limitNum) {
        Map<String, List<User>> map = new HashMap<>();

        map.put("result", managerUserMapper.queryTeacher(Integer.parseInt(limitNum)));
        return map;
    }

    @Override
    public Map<String, List<User>> queryManager(String limitNum) {
        Map<String, List<User>> map = new HashMap<>();

        map.put("result", managerUserMapper.queryManager(Integer.parseInt(limitNum)));
        return map;
    }

    @Override
    public Map<String, List<User>> queryAllUser(String userType) {
        Map<String, List<User>> map = new HashMap<>();

        if (userType.equals("student")) {
            map.put("result", managerUserMapper.queryAllStudent());
        } else if (userType.equals("management")) {
            map.put("result", managerUserMapper.queryAllManager());
        } else {
            map.put("result", managerUserMapper.queryAllTeacher());
        }

        return map;
    }

    @Override
    public Map<String, String> updateUser(String userType, String username, User user) {
        Map<String, String> map = new HashMap<>();

        if (userType.equals("student")) {
            managerUserMapper.updateStudent(username, user.getName());
            map.put("result", "学生用户昵称修改成功");
        } else if (userType.equals("management")) {
            managerUserMapper.updateManager(username, user.getName());
            map.put("result", "管理员用户昵称修改成功");
        } else if (userType.equals("teacher")) {
            managerUserMapper.updateTeacher(username, user.getName());
            map.put("result", "教师用户昵称修改成功");
        }
        return map;
    }
}

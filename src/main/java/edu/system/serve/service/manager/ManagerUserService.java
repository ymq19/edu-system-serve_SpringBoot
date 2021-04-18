package edu.system.serve.service.manager;

import edu.system.serve.pojo.student.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface ManagerUserService {
    Map<String, Object> queryUser(String username, String password);
    Map<String, Object> updatePassword(String username, String passwordSet);
    // 修改或上传图像
    Map<String, String> addAvatar(String username, MultipartFile imgUrl);
    // 查找学生用户
    Map<String, List<User>> queryStudent(String limitNum);
    // 查找教师用户
    Map<String, List<User>> queryTeacher(String limitNum);
    // 查找管理员用户
    Map<String, List<User>> queryManager(String limitNum);
    Map<String, List<User>> queryAllUser(String userType);
}

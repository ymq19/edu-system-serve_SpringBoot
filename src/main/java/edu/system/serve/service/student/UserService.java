package edu.system.serve.service.student;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface UserService {
    Map<String, Object> queryUser(String username, String password);
    // 修改或上传图像
    Map<String, String> addAvatar(String username, MultipartFile imgUrl);
    // 修改个人信息
    void updateProfile(String sno, String data);
    // 修改密码
    Map<String, Object> updatePassword(String username, String passwordSet);
}

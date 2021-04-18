package edu.system.serve.service.manager;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface ManagerUserService {
    Map<String, Object> queryUser(String username, String password);
    Map<String, Object> updatePassword(String username, String passwordSet);
    // 修改或上传图像
    Map<String, String> addAvatar(String username, MultipartFile imgUrl);
}

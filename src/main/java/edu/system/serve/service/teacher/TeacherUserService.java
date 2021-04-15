package edu.system.serve.service.teacher;

import edu.system.serve.pojo.student.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface TeacherUserService {
    Map<String, Object> queryUser(String username, String password);
    // 修改或上传图像
    Map<String, String> addAvatar(String username, MultipartFile imgUrl);
    Map<String, Object> updatePassword(String username, String passwordSet);
}

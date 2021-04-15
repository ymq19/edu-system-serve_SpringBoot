package edu.system.serve.service.teacher;

import edu.system.serve.pojo.student.User;

import java.util.Map;

public interface TeacherUserService {
    Map<String, Object> queryUser(String username, String password);
    Map<String, Object> updatePassword(String username, String passwordSet);
}

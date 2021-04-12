package edu.system.serve.service.teacher;

import java.util.Map;

public interface TeacherUserService {
    Map<String, Object> queryUser(String username, String password);
}

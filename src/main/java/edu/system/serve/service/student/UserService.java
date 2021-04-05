package edu.system.serve.service.student;

import java.util.Map;

public interface UserService {
    Map<String, Object> queryUser(String username, String password);

}

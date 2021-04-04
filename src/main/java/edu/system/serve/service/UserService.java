package edu.system.serve.service;

import edu.system.serve.pojo.student.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    Map<String, Object> queryUser(String username, String password);
}

package edu.system.serve.service;

import edu.system.serve.pojo.student.User;

import java.util.List;

public interface UserService {
    List<User> queryUser(String username, String password);
}

package edu.system.serve.mapper;

import edu.system.serve.pojo.student.User;

import java.util.List;

public interface BaseUserMapper {
    List<User> queryUser(String username, String password);
    void updatePassword(String username, String password);
}

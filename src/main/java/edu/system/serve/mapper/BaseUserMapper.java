package edu.system.serve.mapper;

import edu.system.serve.pojo.student.User;

import java.util.List;

public interface BaseUserMapper {
    // 登录
    List<User> queryUser(String username, String password);
    // 添加用户头像
    void addAvatar(String username, String imgUrl);
    // 更新密码
    void updatePassword(String username, String password);
}

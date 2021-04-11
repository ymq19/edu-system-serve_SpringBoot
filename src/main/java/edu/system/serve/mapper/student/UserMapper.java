package edu.system.serve.mapper.student;

import edu.system.serve.pojo.student.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface UserMapper {
    List<User> queryUser(String username, String password);
    void addAvatar(String username, String imgUrl);
    void updateProfile(String sno, Map<String, String> info);
    void updatePassword(String username, String password);
}

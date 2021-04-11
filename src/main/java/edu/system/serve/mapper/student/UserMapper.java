package edu.system.serve.mapper.student;

import edu.system.serve.pojo.student.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> queryUser(String username, String password);
    void addAvatar(String username, String imgUrl);
}

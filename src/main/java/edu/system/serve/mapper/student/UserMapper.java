package edu.system.serve.mapper.student;

import edu.system.serve.mapper.BaseUserMapper;
import edu.system.serve.pojo.student.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface UserMapper extends BaseUserMapper {
//    List<User> queryUser(String username, String password);
//    void addAvatar(String username, String imgUrl);
//    void updatePassword(String username, String password);
}

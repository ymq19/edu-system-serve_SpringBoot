package edu.system.serve.mapper.teacher;

import edu.system.serve.mapper.BaseUserMapper;
import edu.system.serve.pojo.student.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherUserMapper extends BaseUserMapper {
//    List<User> queryUser(String username, String password);
//    // 修改密码
//    void updatePassword(String username, String password);
}

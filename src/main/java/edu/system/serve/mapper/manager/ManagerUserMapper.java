package edu.system.serve.mapper.manager;

import edu.system.serve.mapper.BaseUserMapper;
import edu.system.serve.pojo.student.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ManagerUserMapper extends BaseUserMapper {
    // 查找学生用户
    List<User> queryStudent(Integer limitNum);
    List<User> queryAllStudent();
    // 查找教师用户
    List<User> queryTeacher(Integer limitNum);
    List<User> queryAllTeacher();
    // 查找管理员用户
    List<User> queryManager(Integer limitNum);
    List<User> queryAllManager();
}

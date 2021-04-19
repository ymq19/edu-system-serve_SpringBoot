package edu.system.serve.mapper.manager;

import edu.system.serve.pojo.manager.Manager;
import edu.system.serve.pojo.student.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ManagerMapper {
    List<Manager> getProfile(String mno);
    void updateProfile(Manager manager);
    // 查询学生信息
    List<Student> getStudentProfile(Integer limitNum);
    List<Student> getAllStudentProfile();
    // 修改学生信息
    void updateStudentProfile(Student student);
    // 删除学生信息
    void deleteStudent(String sno);
}

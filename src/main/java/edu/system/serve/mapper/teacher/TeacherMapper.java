package edu.system.serve.mapper.teacher;

import edu.system.serve.pojo.teacher.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherMapper {
    List<Teacher> getProfile(String tno);
    void updateProfile(String tno, String name, String sex, Integer age, String email, String tel, String intro);
}

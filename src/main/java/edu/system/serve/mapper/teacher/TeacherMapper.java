package edu.system.serve.mapper.teacher;

import edu.system.serve.pojo.teacher.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherMapper {
    List<Teacher> getProfile(String tno);
}

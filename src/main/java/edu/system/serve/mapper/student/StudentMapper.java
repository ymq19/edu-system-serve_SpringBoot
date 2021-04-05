package edu.system.serve.mapper.student;

import edu.system.serve.pojo.student.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {
    List<Student> getProfile(String sno);
}

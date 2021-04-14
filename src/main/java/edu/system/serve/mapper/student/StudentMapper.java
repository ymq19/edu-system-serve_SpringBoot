package edu.system.serve.mapper.student;

import edu.system.serve.pojo.student.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface StudentMapper {
    List<Student> getProfile(String sno);
    void updateProfile(String sno, Map<String, String> info);
}

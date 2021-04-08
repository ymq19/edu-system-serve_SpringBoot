package edu.system.serve.mapper.student;

import edu.system.serve.pojo.student.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CourseMapper {
    List<Course> getCourse(Integer num);
}

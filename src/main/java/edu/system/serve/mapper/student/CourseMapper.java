package edu.system.serve.mapper.student;

import edu.system.serve.pojo.student.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CourseMapper {
    // 获取课程前五条信息
    List<Course> getCourse(Integer num);
    // 获取课程所有信息
    List<Course> getAllCourse();
    // 获取课程名字
    List<Course> getCourseName(String sno);

}

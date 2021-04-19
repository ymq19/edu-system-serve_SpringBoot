package edu.system.serve.mapper.manager;

import edu.system.serve.pojo.student.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Mapper
@Repository
public interface ManagerCourseMapper {
    // 编辑课程
    void updateCourse(Course course);
    // 新增课程
    void addCourse(Course course);
    // 删除课程
    void deleteCourse(String cno);
}

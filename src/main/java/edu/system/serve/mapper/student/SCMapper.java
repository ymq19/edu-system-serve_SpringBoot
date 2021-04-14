package edu.system.serve.mapper.student;

import edu.system.serve.pojo.student.SC;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SCMapper {
    // 获取前五条成绩信息
    List<SC> getGrade(String sno, Integer limitNum);
    // 获取所有成绩信息
    List<SC> getAllGrade(String sno);
    // 获取该学号的所选课程
    List<SC> getCourseBySno(String sno);
    // 获取每门课的已选人数
    List<SC> getCourseSelectedNum();
    // 选课
    void addCourse(String sno, String cno);
    // 退课
    void deleteCourse(String sno, String cno);
}

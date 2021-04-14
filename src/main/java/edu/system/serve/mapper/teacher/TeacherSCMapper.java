package edu.system.serve.mapper.teacher;

import edu.system.serve.pojo.teacher.SCName;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherSCMapper {
    // 查询该教师的课程前五条学生成绩信息
    List<SCName> getGrade(String tno, String limitNum);
}

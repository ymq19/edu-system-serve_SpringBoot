package edu.system.serve.mapper.student;

import edu.system.serve.pojo.student.SC;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SCMapper {
    // 获取前五天成绩信息
    List<SC> getGrade(String sno, Integer limitNum);
    // 获取所有成绩信息
    List<SC> getAllGrade(String sno);
}

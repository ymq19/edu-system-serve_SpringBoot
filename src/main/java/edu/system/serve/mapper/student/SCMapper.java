package edu.system.serve.mapper.student;

import edu.system.serve.pojo.student.SC;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SCMapper {
    List<SC> getGrade(String sno, Integer limitNum);
}

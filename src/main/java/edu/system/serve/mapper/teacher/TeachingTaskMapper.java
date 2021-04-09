package edu.system.serve.mapper.teacher;

import edu.system.serve.pojo.teacher.TeachingTask;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeachingTaskMapper {
    List<TeachingTask> getTeachNotice(String sno, Integer limitNum);
}

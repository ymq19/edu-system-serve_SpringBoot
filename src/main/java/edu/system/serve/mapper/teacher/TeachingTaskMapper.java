package edu.system.serve.mapper.teacher;

import edu.system.serve.pojo.teacher.TeachingTask;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeachingTaskMapper {
    // 获取教学任务前三条信息（学生）
    List<TeachingTask> getTeachNotice(String sno, Integer limitNum);
    // 获取教学任务所有信息（学生）
    List<TeachingTask> getAllTeachNotice(String cno);
    // 获取学号下教学任务所有信息
    List<TeachingTask> getAllTeachNoticeBySno(String cno);

    // 获取教学任务前两条信息
    List<TeachingTask> getTTeachNotice(String tno, String limitNum);
}

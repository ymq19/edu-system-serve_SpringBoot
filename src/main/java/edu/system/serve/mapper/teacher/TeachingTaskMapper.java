package edu.system.serve.mapper.teacher;

import edu.system.serve.pojo.teacher.TeachingTask;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface TeachingTaskMapper {
    // 获取教学任务前三条信息（学生）
    List<TeachingTask> getTeachNotice(String sno, Integer limitNum);
    // 获取学号下教学任务所有信息
    List<TeachingTask> getAllTeachNoticeBySno(String cno);

    // 获取教学任务前两条信息（教师）
    List<TeachingTask> getTTeachNotice(String tno, String limitNum);
    // 获取教学任务所有信息（教师）
    List<TeachingTask> getAllTeachNoticeByTno(String cno);
    // 更新教学任务
    void updateTeachNotice(Map<String, String> map);
    // 删除教学任务
    void deleteTeachNotice(String tno, String cno, String time);
    // 新增教学任务
    void insertTeachNotice(Map<String, String> map);
}

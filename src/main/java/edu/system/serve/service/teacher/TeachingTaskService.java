package edu.system.serve.service.teacher;

import edu.system.serve.pojo.teacher.TeachingTask;

import java.util.List;
import java.util.Map;

public interface TeachingTaskService {
    // 学生
    Map<String, List<TeachingTask>> getTeachNotice(String sno, Integer limitNum);
    Map<String, List> getAllTeachNotice(String sno);
    Map<String, List<TeachingTask>> getAllTeachNoticeBySno(String cno);
    // 教师
    Map<String, List<TeachingTask>> getTTeachNotice(String tno, String limitNum);
}

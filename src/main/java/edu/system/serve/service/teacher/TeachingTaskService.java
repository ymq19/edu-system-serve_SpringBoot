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
    Map<String, List> getAllTTeachNotice(String tno);
    Map<String, List<TeachingTask>> getAllTeachNoticeByTno(String cno);
    Map<String, String> updateTeachNotice(String tno, String cno, String task);
    Map<String, String> deleteTeachNotice(String tno, String cno, String time);
    Map<String, String> insertTeachNotice(String tno, String cno, Map<String, String> notice);
}

package edu.system.serve.service.teacher;

import edu.system.serve.pojo.teacher.SCName;

import java.util.List;
import java.util.Map;

public interface TeacherSCService {
    Map<String, List<SCName>> getGrade(String tno, String limitNum);
    Map<String, List> getAllGrade(String tno);
    Map<String, List<SCName>> getAllGradeByCno(String cno);
    Map<String, String> setGrade(String sno, String cno, String data);
}

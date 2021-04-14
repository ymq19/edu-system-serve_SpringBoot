package edu.system.serve.service.teacher;

import edu.system.serve.pojo.teacher.SCName;

import java.util.List;
import java.util.Map;

public interface TeacherSCService {
    Map<String, List<SCName>> getGrade(String tno, String limitNum);
}

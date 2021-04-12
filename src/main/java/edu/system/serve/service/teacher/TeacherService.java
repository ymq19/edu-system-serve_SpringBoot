package edu.system.serve.service.teacher;

import edu.system.serve.pojo.teacher.Teacher;

import java.util.List;
import java.util.Map;

public interface TeacherService {
    Map<String, List<Teacher>> getProfile(String tno);
}

package edu.system.serve.service.teacher;

import edu.system.serve.pojo.teacher.Teacher;

import java.util.List;
import java.util.Map;

public interface TeacherService {
    Map<String, List<Teacher>> getProfile(String tno);
    Map<String, String> updateProfile(String tno, Teacher teacher);
    Map<String, List<Teacher>> getTeacherName(String tno);
}

package edu.system.serve.service.manager;

import edu.system.serve.pojo.student.Course;

import java.util.Map;

public interface ManagerCourseService {
    Map<String, String> updateCourse(String cno, Map<String, String> course);
}

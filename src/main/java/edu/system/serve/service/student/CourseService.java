package edu.system.serve.service.student;


import java.util.List;
import java.util.Map;

public interface CourseService {
    Map<String, List<Map<String, Object>>> getCourse(Integer num);
    Map<String, List<Map<String, Object>>> getAllCourse();
}

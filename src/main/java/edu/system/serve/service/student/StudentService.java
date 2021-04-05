package edu.system.serve.service.student;

import edu.system.serve.pojo.student.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
    Map<String, List<Student>> getProfile(String sno);
}

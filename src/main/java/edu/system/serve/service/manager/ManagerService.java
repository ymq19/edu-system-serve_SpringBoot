package edu.system.serve.service.manager;

import edu.system.serve.pojo.manager.Manager;
import edu.system.serve.pojo.student.Student;

import java.util.List;
import java.util.Map;

public interface ManagerService {
    Map<String, List<Manager>> getProfile(String mno);
    Map<String, String> updateProfile(String mno, Manager manager);
    Map<String, List<Student>> getStudentProfile(String limitNum);
    Map<String, List<Student>> getAllStudentProfile();
    Map<String, String> updateStudentProfile(String sno, Map<String, String> student);
    Map<String, String> deleteStudent(String sno);
}

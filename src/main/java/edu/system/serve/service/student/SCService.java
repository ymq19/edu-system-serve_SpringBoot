package edu.system.serve.service.student;

import edu.system.serve.pojo.student.SC;

import java.util.List;
import java.util.Map;

public interface SCService {
    Map<String, List<SC>> getGrade(String sno, Integer limitNum);
    Map<String, List<SC>> getAllGrade(String sno);
    // 选课情况
    Map<String, List<SC>> getCourseSelected(String sno);
    // 选课
    Map<String, String> addCourse(String data);
    // 退课
    Map<String, String> deleteCourse(String data);
}

package edu.system.serve.service.student;

import com.alibaba.fastjson.JSON;
import edu.system.serve.pojo.student.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
    // 获取个人信息
    Map<String, List<Student>> getProfile(String sno);
    // 修改个人信息
    void updateProfile(String sno, String data);
}

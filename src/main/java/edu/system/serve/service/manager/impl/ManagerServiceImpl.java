package edu.system.serve.service.manager.impl;

import edu.system.serve.mapper.manager.ManagerMapper;
import edu.system.serve.pojo.manager.Manager;
import edu.system.serve.pojo.student.Student;
import edu.system.serve.service.manager.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerMapper mapper;

    @Override
    public Map<String, List<Manager>> getProfile(String mno) {
        Map<String, List<Manager>> map = new HashMap<>();

        map.put("result", mapper.getProfile(mno));
        return map;
    }

    @Transactional
    @Override
    public Map<String, String> updateProfile(String mno, Manager manager) {
        Map<String, String> map = new HashMap<>();

        manager.setMno(mno);
        mapper.updateProfile(manager);
        map.put("message", "个人信息修改成功");
        return map;
    }

    @Override
    public Map<String, List<Student>> getStudentProfile(String limitNum) {
        Map<String, List<Student>> map = new HashMap<>();

        map.put("result", mapper.getStudentProfile(Integer.parseInt(limitNum)));
        return map;
    }

    @Override
    public Map<String, List<Student>> getAllStudentProfile() {
        Map<String, List<Student>> map = new HashMap<>();

        map.put("result", mapper.getAllStudentProfile());
        return map;
    }

    @Transactional
    @Override
    public Map<String, String> updateStudentProfile(String sno, Map<String, String> student) {
        Map<String, String> map = new HashMap<>();

        Student student1 = new Student(sno,
                student.get("name"),
                student.get("sex"),
                Integer.parseInt(student.get("age")),
                student.get("admi_date"),
                student.get("school"),
                student.get("sdept"),
                student.get("email"),
                student.get("tel"),
                student.get("hobby"),
                student.get("intro"));
        mapper.updateStudentProfile(student1);
        map.put("message", "学生信息修改成功");
        return map;
    }

    @Transactional
    @Override
    public Map<String, String> deleteStudent(String sno) {
        Map<String, String> map = new HashMap<>();

        mapper.deleteStudent(sno);
        map.put("message", "删除学生成功");
        return map;
    }
}

package edu.system.serve.service.student.Impl;

import com.alibaba.fastjson.JSON;
import edu.system.serve.mapper.student.StudentMapper;
import edu.system.serve.pojo.student.Student;
import edu.system.serve.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public Map<String, List<Student>> getProfile(String sno) {
        Map<String, List<Student>> map = new HashMap<>();

        map.put("result", studentMapper.getProfile(sno));
        return map;
    }

    @Transactional
    @Override
    public void updateProfile(String sno, String data) {
        Map<String, String> map = JSON.parseObject(data, Map.class);
        studentMapper.updateProfile(sno, map);
    }
}

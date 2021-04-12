package edu.system.serve.service.teacher.Impl;

import edu.system.serve.mapper.teacher.TeacherMapper;
import edu.system.serve.pojo.teacher.Teacher;
import edu.system.serve.service.teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public Map<String, List<Teacher>> getProfile(String tno) {
        Map<String, List<Teacher>> map = new HashMap<>();

        map.put("result", teacherMapper.getProfile(tno));
        return map;
    }
}

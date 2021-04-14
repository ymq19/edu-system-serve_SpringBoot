package edu.system.serve.service.teacher.Impl;

import edu.system.serve.mapper.teacher.TeacherSCMapper;
import edu.system.serve.pojo.teacher.SCName;
import edu.system.serve.service.teacher.TeacherSCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeacherSCServiceImpl implements TeacherSCService {

    @Autowired
    TeacherSCMapper teacherSCMapper;

    @Override
    public Map<String, List<SCName>> getGrade(String tno, String limitNum) {
        Map<String, List<SCName>> map = new HashMap<>();

        map.put("result", teacherSCMapper.getGrade(tno, limitNum));
        return map;
    }
}

package edu.system.serve.service.teacher.Impl;

import edu.system.serve.mapper.teacher.TeachingTaskMapper;
import edu.system.serve.pojo.teacher.TeachingTask;
import edu.system.serve.service.teacher.TeachingTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeachingTaskServiceImpl implements TeachingTaskService {

    @Autowired
    TeachingTaskMapper teachingTaskMapper;

    @Override
    public Map<String, List<TeachingTask>> getTeachNotice(String sno, Integer limitNum) {
        Map<String, List<TeachingTask>> map = new HashMap<>();

        map.put("result", teachingTaskMapper.getTeachNotice(sno, limitNum));

        return map;
    }
}

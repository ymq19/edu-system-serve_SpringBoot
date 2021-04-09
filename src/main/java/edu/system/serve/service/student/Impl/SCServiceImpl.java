package edu.system.serve.service.student.Impl;

import edu.system.serve.mapper.student.SCMapper;
import edu.system.serve.pojo.student.SC;
import edu.system.serve.service.student.SCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SCServiceImpl implements SCService {

    @Autowired
    SCMapper scMapper;

    @Override
    public Map<String, List<SC>> getGrade(String sno, Integer limitNum) {
        Map<String, List<SC>> map = new HashMap<>();

        map.put("result", scMapper.getGrade(sno, limitNum));
        return map;
    }
}

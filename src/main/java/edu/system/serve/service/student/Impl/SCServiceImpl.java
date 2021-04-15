package edu.system.serve.service.student.Impl;

import com.alibaba.fastjson.JSON;
import edu.system.serve.mapper.student.SCMapper;
import edu.system.serve.pojo.student.SC;
import edu.system.serve.service.student.SCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    public Map<String, List<SC>> getAllGrade(String sno) {
        Map<String, List<SC>> map = new HashMap<>();

        map.put("result", scMapper.getAllGrade(sno));
        return map;
    }

    @Override
    public Map<String, List<SC>> getCourseSelected(String sno) {
        Map<String, List<SC>> map = new HashMap<>();

        map.put("stuCourse", scMapper.getCourseBySno(sno));
        map.put("course", scMapper.getCourseSelectedNum());

        return map;
    }

    @Transactional
    @Override
    public Map<String, String> addCourse(String data) {
        Map<String, String> snoCno = JSON.parseObject(data, Map.class);
        Map<String, String> map = new HashMap<>();

        scMapper.addCourse(snoCno.get("sno"), snoCno.get("cno"));
        map.put("message", "选课成功");

        return map;
    }

    @Transactional
    @Override
    public Map<String, String> deleteCourse(String data) {
        Map<String, String> snoCno = JSON.parseObject(data, Map.class);
        Map<String, String> map = new HashMap<>();

        scMapper.deleteCourse(snoCno.get("sno"), snoCno.get("cno"));
        map.put("message", "退课成功");

        return map;
    }

}

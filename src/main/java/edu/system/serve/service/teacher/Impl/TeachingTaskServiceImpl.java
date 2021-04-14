package edu.system.serve.service.teacher.Impl;

import edu.system.serve.mapper.student.CourseMapper;
import edu.system.serve.mapper.teacher.TeachingTaskMapper;
import edu.system.serve.pojo.student.Course;
import edu.system.serve.pojo.teacher.TeachingTask;
import edu.system.serve.service.teacher.TeachingTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeachingTaskServiceImpl implements TeachingTaskService {

    @Autowired
    TeachingTaskMapper teachingTaskMapper;
    @Autowired
    CourseMapper courseMapper;

    @Override
    public Map<String, List<TeachingTask>> getTeachNotice(String sno, Integer limitNum) {
        Map<String, List<TeachingTask>> map = new HashMap<>();

        map.put("result", teachingTaskMapper.getTeachNotice(sno, limitNum));

        return map;
    }

    // 开启事务
    @Transactional
    @Override
    public Map<String, List> getAllTeachNotice(String sno) {
        List<Course> courses = courseMapper.getCourseName(sno);
        Map<String, List> map = new HashMap<>();
        if (courses.size() != 0) {
            map.put("notice", teachingTaskMapper.getAllTeachNotice(courses.get(0).getCno()));
            map.put("course", courses);
        }
        return map;
    }

    @Override
    public Map<String, List<TeachingTask>> getAllTeachNoticeBySno(String cno) {
        Map<String, List<TeachingTask>> map = new HashMap<>();

        map.put("notice", teachingTaskMapper.getAllTeachNoticeBySno(cno));

        return map;
    }

    @Override
    public Map<String, List<TeachingTask>> getTTeachNotice(String tno, String limitNum) {
        Map<String, List<TeachingTask>> map = new HashMap<>();

        map.put("result", teachingTaskMapper.getTTeachNotice(tno, limitNum));
        return map;
    }
}

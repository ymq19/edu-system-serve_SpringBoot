package edu.system.serve.service.teacher.Impl;

import com.alibaba.fastjson.JSON;
import edu.system.serve.mapper.student.CourseMapper;
import edu.system.serve.mapper.teacher.TeacherSCMapper;
import edu.system.serve.pojo.student.Course;
import edu.system.serve.pojo.teacher.SCName;
import edu.system.serve.service.teacher.TeacherSCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeacherSCServiceImpl implements TeacherSCService {

    @Autowired
    TeacherSCMapper teacherSCMapper;
    @Autowired
    CourseMapper courseMapper;

    @Override
    public Map<String, List<SCName>> getGrade(String tno, String limitNum) {
        Map<String, List<SCName>> map = new HashMap<>();

        map.put("result", teacherSCMapper.getGrade(tno, limitNum));
        return map;
    }

    @Transactional
    @Override
    public Map<String, List> getAllGrade(String tno) {
        Map<String, List> map = new HashMap<>();
        List<Course> courses = courseMapper.getCourseNameByTno(tno);

        if (courses.size() != 0) {
            map.put("course", courses);
            map.put("grade", teacherSCMapper.getAllGrade(courses.get(0).getCno()));
        }

        return map;
    }

    @Override
    public Map<String, List<SCName>> getAllGradeByCno(String cno) {
        Map<String, List<SCName>> map = new HashMap<>();

        map.put("grade", teacherSCMapper.getAllGrade(cno));
        return map;
    }

    @Transactional
    @Override
    public Map<String, String> setGrade(String sno, String cno, String data) {
        Map<String, String> map = new HashMap<>();
        Map<String, Object> grade = JSON.parseObject(data);

        teacherSCMapper.setGrade(
                Integer.parseInt(grade.get("grade").toString()),
                Double.parseDouble(grade.get("gradePo").toString()),
                sno,
                cno);
        map.put("message", "成绩修改成功");
        return map;
    }
}

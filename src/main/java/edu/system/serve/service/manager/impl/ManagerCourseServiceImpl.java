package edu.system.serve.service.manager.impl;

import edu.system.serve.mapper.manager.ManagerCourseMapper;
import edu.system.serve.pojo.student.Course;
import edu.system.serve.service.manager.ManagerCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
public class ManagerCourseServiceImpl implements ManagerCourseService {

    @Autowired
    ManagerCourseMapper mapper;

    @Transactional
    @Override
    public Map<String, String> updateCourse(String cno, Map<String, String> course) {
        Map<String, String> map = new HashMap<>();

        Course course1 = new Course(
                cno,
                course.get("name"),
                course.get("cpno"),
                Integer.parseInt(course.get("credit")),
                course.get("tno"),
                Integer.parseInt(course.get("capacity"))
        );
        mapper.updateCourse(course1);
        map.put("message", "课程修改成功");
        return map;
    }
}

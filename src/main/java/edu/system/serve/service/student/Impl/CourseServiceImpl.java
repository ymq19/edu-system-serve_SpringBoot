package edu.system.serve.service.student.Impl;

import com.alibaba.fastjson.JSON;
import edu.system.serve.mapper.student.CourseMapper;
import edu.system.serve.pojo.student.Course;
import edu.system.serve.service.student.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseMapper courseMapper;

    @Override
    public Map<String, List<Map<String, Object>>> getCourse(Integer num) {
        List<Course> courses = courseMapper.getCourse(num);
        List<Map<String, Object>> mapList = new ArrayList<>();
        Map<String, List<Map<String, Object>>> map = new HashMap<>();

        for (Course course : courses) {
            // 实体类转Map
            Map<String, Object> courseMap = JSON.parseObject(JSON.toJSONString(course), Map.class);
            courseMap.replace("teacher", course.getTeacher().getName());
            mapList.add(courseMap);
        }

        map.put("result", mapList);

        return map;
    }
}

package edu.system.serve.controller.student;

import edu.system.serve.service.student.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/api/v1/course")
    public Map<String, List<Map<String, Object>>> getCourse(@RequestParam String limit) {
        Integer num = Integer.parseInt(limit);

        return courseService.getCourse(num);
    }

    @GetMapping("/api/v1/course/all")
    public Map<String, List<Map<String, Object>>> getAllCourse() {
        return courseService.getAllCourse();
    }

}

package edu.system.serve.controller.manager;

import edu.system.serve.pojo.student.Course;
import edu.system.serve.service.manager.ManagerCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class ManagerCourseController {

    @Autowired
    ManagerCourseService managerCourseService;

    @PutMapping("/super-user/info/course/{cno}")
    public Map<String, String> updateCourse(@PathVariable String cno, @RequestBody Map<String, String> course) {
        return managerCourseService.updateCourse(cno, course);
    }

    @DeleteMapping("/super-user/info/course/{cno}")
    public Map<String, String> deleteCourse(@PathVariable String cno) {
        return managerCourseService.deleteCourse(cno);
    }

    @PostMapping("/super-user/info/course")
    public Map<String, String> addCourse(@RequestBody Map<String, String> map) {
        return managerCourseService.addCourse(map);
    }
}

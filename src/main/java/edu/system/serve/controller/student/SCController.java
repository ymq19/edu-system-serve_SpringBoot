package edu.system.serve.controller.student;

import edu.system.serve.pojo.student.SC;
import edu.system.serve.service.student.SCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class SCController {

    @Autowired
    SCService service;

    @GetMapping("/api/v1/grade")
    public Map<String, List<SC>> getGrade(@RequestParam String sno, @RequestParam String limit) {
        return service.getGrade(sno, Integer.parseInt(limit));
    }

    @GetMapping("/api/v1/grade/all")
    public Map<String, List<SC>> getAllGrade(@RequestParam String sno) {
        return service.getAllGrade(sno);
    }

    @GetMapping("/api/v1/{sno}/selection/course")
    public Map<String, List<SC>> getCourseSelected(@PathVariable String sno) {
        return service.getCourseSelected(sno);
    }

    @PostMapping("/api/v1/selection/course")
    public Map<String, String> addCourse(@RequestBody String data) {
        return service.addCourse(data);
    }

    @DeleteMapping("/api/v1/selection/course")
    public Map<String, String> deleteCourse(@RequestBody String data) {
        return service.deleteCourse(data);
    }
}

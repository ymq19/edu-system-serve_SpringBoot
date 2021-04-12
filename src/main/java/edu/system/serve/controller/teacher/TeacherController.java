package edu.system.serve.controller.teacher;

import edu.system.serve.pojo.teacher.Teacher;
import edu.system.serve.service.teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping("/teacher/profile/{tno}")
    public Map<String, List<Teacher>> getProfile(@PathVariable String tno) {
        return teacherService.getProfile(tno);
    }
}

package edu.system.serve.controller.teacher;

import edu.system.serve.pojo.teacher.Teacher;
import edu.system.serve.service.teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/teacher/profile/{tno}")
    public Map<String, String> updateProfile(@PathVariable String tno, @RequestBody Teacher teacher) {
        return teacherService.updateProfile(tno, teacher);
    }
}

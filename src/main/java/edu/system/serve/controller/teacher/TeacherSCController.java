package edu.system.serve.controller.teacher;

import edu.system.serve.pojo.teacher.SCName;
import edu.system.serve.service.teacher.TeacherSCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class TeacherSCController {
    @Autowired
    TeacherSCService teacherSCService;

    @GetMapping("/teacher/{tno}/course/grade")
    public Map<String, List<SCName>> getGrade(@PathVariable String tno, @RequestParam String limit) {
        return teacherSCService.getGrade(tno, limit);
    }
}

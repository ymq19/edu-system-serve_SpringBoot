package edu.system.serve.controller.manager;

import edu.system.serve.service.teacher.TeacherSCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class ManagerSCController {

    @Autowired
    TeacherSCService teacherSCService;

    @PutMapping("/super-user/info/grade/{sno}/course/{cno}")
    public Map<String, String> setGrade(@PathVariable String sno, @PathVariable String cno, @RequestBody String data) {
        return teacherSCService.setGrade(sno, cno, data);
    }
}

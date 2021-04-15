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

    /**
     * 获取前几条成绩
     * @param tno
     * @param limit
     * @return
     */
    @GetMapping("/teacher/{tno}/course/grade")
    public Map<String, List<SCName>> getGrade(@PathVariable String tno, @RequestParam String limit) {
        return teacherSCService.getGrade(tno, limit);
    }

    @GetMapping("/teacher/info/{tno}/grade/all")
    public Map<String, List> getAllGrade(@PathVariable String tno) {
        return teacherSCService.getAllGrade(tno);
    }

    @GetMapping("/teacher/info/{tno}/grade/{cno}")
    public Map<String, List<SCName>> getAllGradeByCno(@PathVariable String cno) {
        return teacherSCService.getAllGradeByCno(cno);
    }

    @PutMapping("/teacher/info/course/{cno}/stu/{sno}")
    public Map<String, String> setGrade(@PathVariable String sno, @PathVariable String cno, @RequestBody String data) {
        return teacherSCService.setGrade(sno, cno, data);
    }
}

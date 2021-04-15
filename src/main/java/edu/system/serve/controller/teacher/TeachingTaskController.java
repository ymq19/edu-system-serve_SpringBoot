package edu.system.serve.controller.teacher;

import edu.system.serve.pojo.teacher.TeachingTask;
import edu.system.serve.service.teacher.TeachingTaskService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class TeachingTaskController {

    @Autowired
    TeachingTaskService teachingTaskService;

    @GetMapping("/notice/{sno}")
    public Map<String, List<TeachingTask>> getTeachTask(@PathVariable String sno, @RequestParam String limit) {

        return teachingTaskService.getTeachNotice(sno, Integer.parseInt(limit));
    }

    @GetMapping("/notice/{sno}/all")
    public Map<String, List> getAllTeachTask(@PathVariable String sno) {
        return teachingTaskService.getAllTeachNotice(sno);
    }

    @GetMapping("/notice/{sno}/course/{cno}/all")
    public Map<String, List<TeachingTask>> getAllTeachTaskBySno(@PathVariable String cno) {
        return teachingTaskService.getAllTeachNoticeBySno(cno);
    }

    @GetMapping("/teacher/info/{tno}/tasks")
    public Map<String, List<TeachingTask>> getTTeachTask(@PathVariable String tno, @RequestParam String limit) {
        return teachingTaskService.getTTeachNotice(tno, limit);
    }

    @GetMapping("/teacher/info/{tno}/tasks/all")
    public Map<String, List> getAllTTeachTask(@PathVariable String tno) {
        return teachingTaskService.getAllTTeachNotice(tno);
    }

    @GetMapping("/teacher/info/{tno}/course/{cno}/tasks/all")
    public Map<String, List<TeachingTask>> getAllTeachTaskByTno(@PathVariable String cno) {
        return teachingTaskService.getAllTeachNoticeByTno(cno);
    }
}

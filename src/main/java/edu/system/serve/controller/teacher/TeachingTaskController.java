package edu.system.serve.controller.teacher;

import edu.system.serve.pojo.teacher.TeachingTask;
import edu.system.serve.service.teacher.TeachingTaskService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TeachingTaskController {

    @Autowired
    TeachingTaskService teachingTaskService;

    @GetMapping("/api/v1/notice/{sno}")
    public Map<String, List<TeachingTask>> getTeachTask(@PathVariable String sno, @RequestParam String limit) {

        return teachingTaskService.getTeachNotice(sno, Integer.parseInt(limit));
    }
}

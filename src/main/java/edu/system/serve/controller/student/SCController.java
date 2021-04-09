package edu.system.serve.controller.student;

import edu.system.serve.pojo.student.SC;
import edu.system.serve.service.student.SCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}

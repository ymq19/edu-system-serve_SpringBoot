package edu.system.serve.controller.student;

import edu.system.serve.pojo.student.Evaluation;
import edu.system.serve.service.student.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class EvaluationController {

    @Autowired
    private EvaluationService evaluationService;

    @GetMapping("/evaluation/{sno}")
    public Map<String, List<Evaluation>> getEvaluation(@PathVariable String sno) {
        return evaluationService.getEvaluation(sno);
    }

    @PostMapping("/evaluation/teacher")
    public Map<String, String> setEvaluation(@RequestBody String data) {
        return evaluationService.setEvaluation(data);
    }
}

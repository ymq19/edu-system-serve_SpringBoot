package edu.system.serve.service.student;

import edu.system.serve.pojo.student.Evaluation;

import java.util.List;
import java.util.Map;

public interface EvaluationService {
    Map<String, List<Evaluation>> getEvaluation(String sno);
    Map<String, String> setEvaluation(String data);
}

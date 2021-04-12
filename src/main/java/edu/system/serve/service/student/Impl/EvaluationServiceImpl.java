package edu.system.serve.service.student.Impl;

import com.alibaba.fastjson.JSON;
import edu.system.serve.mapper.student.EvaluationMapper;
import edu.system.serve.pojo.student.Evaluation;
import edu.system.serve.service.student.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EvaluationServiceImpl implements EvaluationService {

    @Autowired
    private EvaluationMapper evaluationMapper;

    @Override
    public Map<String, List<Evaluation>> getEvaluation(String sno) {
        Map<String, List<Evaluation>> map = new HashMap<>();

        map.put("result", evaluationMapper.getEvaluation(sno));
        return map;
    }

    @Override
    public Map<String, String> setEvaluation(String data) {
        // json转map
        Map<String, String> map = JSON.parseObject(data, Map.class);
        Map<String, String> resMap = new HashMap<>();

        evaluationMapper.setEvaluation(map.get("sno"), map.get("tno"), map.get("evaluation"));
        resMap.put("message", "教师评价修改成功");

        return resMap;
    }
}

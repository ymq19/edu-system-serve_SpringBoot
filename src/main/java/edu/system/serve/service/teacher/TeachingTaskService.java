package edu.system.serve.service.teacher;

import edu.system.serve.pojo.teacher.TeachingTask;

import java.util.List;
import java.util.Map;

public interface TeachingTaskService {
    Map<String, List<TeachingTask>> getTeachNotice(String sno, Integer limitNum);
}

package edu.system.serve.service.teacher.Impl;

import com.alibaba.fastjson.JSON;
import edu.system.serve.mapper.student.CourseMapper;
import edu.system.serve.mapper.teacher.TeachingTaskMapper;
import edu.system.serve.pojo.student.Course;
import edu.system.serve.pojo.teacher.TeachingTask;
import edu.system.serve.service.teacher.TeachingTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeachingTaskServiceImpl implements TeachingTaskService {

    @Autowired
    TeachingTaskMapper teachingTaskMapper;
    @Autowired
    CourseMapper courseMapper;

    @Override
    public Map<String, List<TeachingTask>> getTeachNotice(String sno, Integer limitNum) {
        Map<String, List<TeachingTask>> map = new HashMap<>();

        map.put("result", teachingTaskMapper.getTeachNotice(sno, limitNum));

        return map;
    }

    // 开启事务
    @Transactional
    @Override
    public Map<String, List> getAllTeachNotice(String sno) {
        List<Course> courses = courseMapper.getCourseName(sno);
        Map<String, List> map = new HashMap<>();
        if (courses.size() != 0) {
            map.put("notice", teachingTaskMapper.getAllTeachNoticeBySno(courses.get(0).getCno()));
            map.put("course", courses);
        }
        return map;
    }

    @Override
    public Map<String, List<TeachingTask>> getAllTeachNoticeBySno(String cno) {
        Map<String, List<TeachingTask>> map = new HashMap<>();

        map.put("notice", teachingTaskMapper.getAllTeachNoticeBySno(cno));

        return map;
    }

    @Override
    public Map<String, List<TeachingTask>> getTTeachNotice(String tno, String limitNum) {
        Map<String, List<TeachingTask>> map = new HashMap<>();

        map.put("result", teachingTaskMapper.getTTeachNotice(tno, limitNum));
        return map;
    }

    @Override
    public Map<String, List> getAllTTeachNotice(String tno) {
        Map<String, List> map = new HashMap<>();
        List<Course> courses = courseMapper.getCourseNameByTno(tno);

        if (courses.size() != 0) {
            map.put("tasks", teachingTaskMapper.getAllTeachNoticeByTno(courses.get(0).getCno()));
            map.put("course", courses);
        }
        return map;
    }

    @Override
    public Map<String, List<TeachingTask>> getAllTeachNoticeByTno(String cno) {
        Map<String, List<TeachingTask>> map = new HashMap<>();

        map.put("tasks", teachingTaskMapper.getAllTeachNoticeByTno(cno));

        return map;
    }

    @Transactional
    @Override
    public Map<String, String> updateTeachNotice(String tno, String cno, String task) {
        Map<String, String> map = new HashMap<>();
        Map<String, String> taskMap = JSON.parseObject(task, Map.class);

        taskMap.put("tno", tno);
        taskMap.put("cno", cno);

        teachingTaskMapper.updateTeachNotice(taskMap);
        map.put("message", "教学任务修改成功");
        return map;
    }

    @Transactional
    @Override
    public Map<String, String> deleteTeachNotice(String tno, String cno, String time) {
        Map<String, String> timeMap = JSON.parseObject(time, Map.class);
        Map<String, String> map = new HashMap<>();

        teachingTaskMapper.deleteTeachNotice(tno, cno, timeMap.get("time"));
        map.put("message", "教学任务删除成功");
        return map;
    }

    @Override
    public Map<String, String> insertTeachNotice(String tno, String cno, Map<String, String> notice) {
        Map<String, String> map = new HashMap<>();

        notice.put("tno", tno);
        notice.put("cno",cno);
        teachingTaskMapper.insertTeachNotice(notice);
        map.put("message", "教学任务新增成功");
        return map;
    }
}

package edu.system.serve.service.teacher.Impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import edu.system.serve.mapper.teacher.TeacherMapper;
import edu.system.serve.pojo.teacher.Teacher;
import edu.system.serve.service.teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public Map<String, List<Teacher>> getProfile(String tno) {
        Map<String, List<Teacher>> map = new HashMap<>();

        map.put("result", teacherMapper.getProfile(tno));
        return map;
    }

    @Transactional
    @Override
    public Map<String, String> updateProfile(String tno, Teacher teacher) {
        Map<String, String> map = new HashMap<>();
        Map teacherMap = JSONObject.parseObject(JSON.toJSON(teacher).toString());

        teacherMapper.updateProfile(tno,
                teacherMap.get("name").toString(),
                teacherMap.get("sex").toString(),
                Integer.parseInt(teacherMap.get("age").toString()),
                teacherMap.get("email").toString(),
                teacherMap.get("tel").toString(),
                teacherMap.get("intro").toString());
        map.put("message", "个人信息修改成功");
        return map;
    }

    @Override
    public Map<String, List<Teacher>> getTeacherName(String tno) {
        Map<String, List<Teacher>> map = new HashMap<>();

        map.put("result", teacherMapper.getTeacherName(tno));
        return map;
    }
}

package edu.system.serve.service.manager.impl;

import edu.system.serve.mapper.manager.ManagerMapper;
import edu.system.serve.pojo.manager.Manager;
import edu.system.serve.service.manager.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerMapper mapper;

    @Override
    public Map<String, List<Manager>> getProfile(String mno) {
        Map<String, List<Manager>> map = new HashMap<>();

        map.put("result", mapper.getProfile(mno));
        return map;
    }

    @Transactional
    @Override
    public Map<String, String> updateProfile(String mno, Manager manager) {
        Map<String, String> map = new HashMap<>();

        manager.setMno(mno);
        mapper.updateProfile(manager);
        map.put("message", "个人信息修改成功");
        return map;
    }
}

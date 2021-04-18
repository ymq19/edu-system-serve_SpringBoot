package edu.system.serve.mapper.manager;

import edu.system.serve.pojo.manager.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ManagerMapper {
    List<Manager> getProfile(String mno);
    void updateProfile(Manager manager);
}

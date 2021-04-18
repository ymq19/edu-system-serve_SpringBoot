package edu.system.serve.service.manager;

import edu.system.serve.pojo.manager.Manager;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface ManagerService {
    Map<String, List<Manager>> getProfile(String mno);
    Map<String, String> updateProfile(String mno, Manager manager);
}

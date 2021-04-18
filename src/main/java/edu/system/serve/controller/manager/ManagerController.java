package edu.system.serve.controller.manager;

import edu.system.serve.pojo.manager.Manager;
import edu.system.serve.service.manager.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @GetMapping("/super-user/profile/{mno}")
    public Map<String, List<Manager>> getProfile(@PathVariable String mno) {
        return managerService.getProfile(mno);
    }

    @PutMapping("/super-user/profile/{mno}")
    public Map<String, String> updateProfile(@PathVariable String mno, @RequestBody Manager data) {
        return managerService.updateProfile(mno, data);
    }
}

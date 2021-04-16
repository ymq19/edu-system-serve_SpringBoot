package edu.system.serve.controller.manager;

import edu.system.serve.pojo.student.User;
import edu.system.serve.service.manager.ManagerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class ManagerUserController {

    @Autowired
    ManagerUserService managerUserService;

    @PostMapping("/super-user/login")
    public Map<String, Object> userLogin(@RequestBody User user) {
        return managerUserService.queryUser(user.getUsername(), user.getPassword());
    }

    @PutMapping("/super-user/reset/{username}")
    public Map<String, Object> updatePassword(@PathVariable String username, @RequestBody String data) {
        return managerUserService.updatePassword(username, data);
    }
}

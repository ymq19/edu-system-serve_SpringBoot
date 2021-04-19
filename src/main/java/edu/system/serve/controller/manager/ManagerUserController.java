package edu.system.serve.controller.manager;

import edu.system.serve.pojo.student.User;
import edu.system.serve.service.manager.ManagerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    @GetMapping("/super-user/user/student")
    public Map<String, List<User>> queryStudent(@RequestParam String limit) {
        return managerUserService.queryStudent(limit);
    }

    @GetMapping("/super-user/user/teacher")
    public Map<String, List<User>> queryTeacher(@RequestParam String limit) {
        return managerUserService.queryTeacher(limit);
    }

    @GetMapping("/super-user/user/management")
    public Map<String, List<User>> queryManager(@RequestParam String limit) {
        return managerUserService.queryManager(limit);
    }

    @GetMapping("/super-user/user/all/{userType}")
    public Map<String, List<User>> queryUserType(@PathVariable String userType) {
        return managerUserService.queryAllUser(userType);
    }

    @PutMapping("/super-user/user/{userType}/{username}")
    public Map<String, String> updateUser(@PathVariable String userType, @PathVariable String username, @RequestBody User data) {
        return managerUserService.updateUser(userType, username, data);
    }
}

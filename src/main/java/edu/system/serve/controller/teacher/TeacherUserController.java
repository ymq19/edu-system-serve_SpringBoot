package edu.system.serve.controller.teacher;

import edu.system.serve.pojo.student.User;
import edu.system.serve.service.teacher.TeacherUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class TeacherUserController {

    @Autowired
    private TeacherUserService userService;


    @PostMapping("/teacher/login")
    public Map<String, Object> userLogin(@RequestBody User user) {

        return userService.queryUser(user.getUsername(), user.getPassword());
    }

    @PutMapping("/teacher/reset/{username}")
    public Map<String, Object> updatePassword(@PathVariable String username, @RequestBody String data) {
        return userService.updatePassword(username, data);
    }
}

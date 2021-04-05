package edu.system.serve.controller.student;

import edu.system.serve.pojo.student.User;
import edu.system.serve.service.student.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/api/v1/login")
    public Map<String, Object> userLogin(@RequestBody User user) {
        Map<String, Object> map = userService.queryUser(user.getUsername(), user.getPassword());

        return map;
    }
}

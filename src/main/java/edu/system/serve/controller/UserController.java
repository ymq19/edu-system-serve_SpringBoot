package edu.system.serve.controller;

import edu.system.serve.pojo.student.User;
import edu.system.serve.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/api/v1/login")
    public String userLogin(@RequestBody User user) {
        List<User> user1 = userService.queryUser(user.getUsername(), user.getPassword());
        System.out.println(user1.size());

        return "success";
    }
}

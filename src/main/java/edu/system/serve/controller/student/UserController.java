package edu.system.serve.controller.student;

import edu.system.serve.pojo.student.User;
import edu.system.serve.service.student.UserService;
import edu.system.serve.service.teacher.Impl.TeacherUserServiceImpl;
import edu.system.serve.service.teacher.TeacherUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private TeacherUserService teacherUserService;

    @PostMapping("/login")
    public Map<String, Object> userLogin(@RequestBody User user) {
        Map<String, Object> map = userService.queryUser(user.getUsername(), user.getPassword());

        return map;
    }

    @PostMapping("/avatar/{username}")
    public Map<String, String> addAvatar(@PathVariable String username, @RequestParam MultipartFile image, @RequestParam(defaultValue = "stu") String userType) {
        if (userType.equals("teach")) {
            return teacherUserService.addAvatar(username, image);
        }

        return userService.addAvatar(username, image);
    }

    @PutMapping("/reset/{username}")
    public Map<String, Object> updatePassword(@PathVariable String username, @RequestBody String data) {
        return userService.updatePassword(username, data);
    }
}

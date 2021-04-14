package edu.system.serve.controller.student;

import edu.system.serve.pojo.student.Student;
import edu.system.serve.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/profile/{sno}")
    public Map<String, List<Student>> getProfile(@PathVariable String sno) {
        return studentService.getProfile(sno);
    }

    @PutMapping("/profile/{sno}")
    public void updateProfile(@PathVariable String sno, @RequestBody String data) {
        studentService.updateProfile(sno, data);
    }
}

package edu.system.serve.controller.student;

import edu.system.serve.pojo.student.Student;
import edu.system.serve.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/api/v1/profile/{sno}")
    public Map<String, List<Student>> getProfile(@PathVariable String sno) {


        return studentService.getProfile(sno);
    }
}

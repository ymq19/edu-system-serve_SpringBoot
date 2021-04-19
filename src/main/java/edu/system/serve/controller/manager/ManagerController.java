package edu.system.serve.controller.manager;

import edu.system.serve.pojo.manager.Manager;
import edu.system.serve.pojo.student.Student;
import edu.system.serve.service.manager.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.rmi.CORBA.StubDelegate;
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

    @GetMapping("/super-user/info/student")
    public Map<String, List<Student>> getStudentProfile(@RequestParam String limit) {
        return managerService.getStudentProfile(limit);
    }

    @GetMapping("/super-user/info/student/all")
    public Map<String, List<Student>> getAllStudentProfile() {
        return managerService.getAllStudentProfile();
    }

    @PutMapping("/super-user/info/student/{sno}")
    public Map<String, String> updateStudentProfile(@PathVariable String sno, @RequestBody Map<String, String> student) {
        return managerService.updateStudentProfile(sno, student);
    }

    @DeleteMapping("/super-user/info/student/{sno}")
    public Map<String, String> deleteStudent(@PathVariable String sno) {
        return managerService.deleteStudent(sno);
    }
}

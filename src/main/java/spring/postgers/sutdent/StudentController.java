package spring.postgers.sutdent;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path = "api/students")
public class StudentController {

        public final StudentService studentService;

        @Autowired
        public StudentController(StudentService service) {
                this.studentService = service;
        }

        @GetMapping("/all")
        public List<Student> getAlStudents() {
                return studentService.getAllStudents();
        }

}

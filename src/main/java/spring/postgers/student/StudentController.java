package spring.postgers.student;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path = "api/students")
public class StudentController {

        public final StudentService studentService;

        public StudentController(StudentService service) {
                this.studentService = service;
        }

        @GetMapping("/all")
        public List<Student> getAlStudents() {
                return studentService.getAllStudents();
        }

}

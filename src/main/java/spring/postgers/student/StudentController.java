package spring.postgers.student;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(path = "api/students")
public class StudentController {

        public final StudentService studentService;

        public StudentController(StudentService service) {
                this.studentService = service;
        }

        @GetMapping("/all")
        public List<Student> getAllStudents() {
                return studentService.getAllStudents();
        }

        @PostMapping("/add")
        public void addNewStudent(@RequestBody Student student) {
                studentService.addNewStudent(student);
        }

}

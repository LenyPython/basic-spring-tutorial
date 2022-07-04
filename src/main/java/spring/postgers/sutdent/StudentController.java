package spring.postgers.sutdent;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path = "api/students")
public class StudentController {

        private final StudentService studentService;

        public StudentController(StudentService studentService) {
                this.studentService = studentService;
        }

        @GetMapping("/all")
        public List<Student> getStudents() {
                return this.studentService.getAllStudents();
        }
}

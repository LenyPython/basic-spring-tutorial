package spring.postgers.student;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

        private final StudentRepository studentRepository;

        public StudentService(StudentRepository repository) {
                this.studentRepository = repository;
        }

        public List<Student> getAllStudents() {
                return studentRepository.findAll();
        }

        public void addNewStudent(Student student) {
                System.out.println(student);

        }

}

package spring.postgers.student;

import java.util.List;
import java.util.Optional;

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

        public void deleteStudent(Long id) {
                boolean exists = studentRepository.existsById(id);
                if (exists) {
                        studentRepository.deleteById(id);
                } else {
                        throw new IllegalArgumentException("No student with this id exists");
                }
        }

        public void addNewStudent(Student student) {
                Optional<Student> studentOptional = studentRepository.getStudentByFullName(student.getName(),
                                student.getSecondName());
                if (studentOptional.isPresent()) {
                        throw new IllegalStateException("user exists");
                }
                studentRepository.save(student);

        }

}

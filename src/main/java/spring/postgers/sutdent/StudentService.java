package spring.postgers.sutdent;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public List<Student> getAllStudents() {
        return List.of(
                new Student(
                        1L,
                        "Piotr",
                        "Kowalski"),
                new Student(
                        2L,
                        "John",
                        "Buahah"),
                new Student(
                        3L,
                        "Alan",
                        "Kowalski",
                        LocalDate.of(1987, Month.FEBRUARY, 5)));
    }
}

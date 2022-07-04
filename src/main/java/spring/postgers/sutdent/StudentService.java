package spring.postgers.sutdent;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getAllStudents() {
        return List.of(
                new Student(
                        1L,
                        "Paul",
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

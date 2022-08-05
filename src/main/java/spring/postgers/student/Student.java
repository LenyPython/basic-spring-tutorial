package spring.postgers.student;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "secondName")
    private String secondName;
    @Column(name = "birth_date")
    private LocalDate date;

    public Student() {
    }

    public Student(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public Student(String name, String secondName, LocalDate date) {
        this.name = name;
        this.secondName = secondName;
        this.date = date;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getName() {
        return this.name;
    }

    public void getName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public void getSecondName(String second) {
        this.secondName = second;
    }

    public String getFullName() {
        return this.name + " " + this.secondName;
    }

    @Override
    public String toString() {
        return name + " " + secondName;
    }
}

package com.example.relations.entity.manyToMany;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teachers")
@Data
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teacher_id;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "teacher_student",
            joinColumns = @JoinColumn(name = "teacher_id", referencedColumnName = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "student_id"))
    private List<Student> students;
}

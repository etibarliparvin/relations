package com.example.relations.entity.manyToMany;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long student_id;
    private String name;

    @ManyToMany(mappedBy = "students", cascade = CascadeType.ALL)
    private List<Teacher> teachers;
}

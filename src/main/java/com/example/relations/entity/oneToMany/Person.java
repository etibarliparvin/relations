package com.example.relations.entity.oneToMany;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "persons")
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Car> cars;
}

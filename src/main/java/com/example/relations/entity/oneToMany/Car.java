package com.example.relations.entity.oneToMany;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
}

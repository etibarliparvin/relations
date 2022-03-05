package com.example.relations.entity.oneToOne;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mothers")
@Data
public class Mother {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Child child;
}

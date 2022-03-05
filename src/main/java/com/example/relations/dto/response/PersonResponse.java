package com.example.relations.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class PersonResponse {
    private Long id;
    private String name;
    private List<CarResponse> cars;
}

package com.example.relations.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class PersonRequest {
    private String name;
    private List<CarRequest> cars;
}

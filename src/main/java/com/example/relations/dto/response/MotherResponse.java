package com.example.relations.dto.response;

import lombok.Data;

@Data
public class MotherResponse {

    private Long id;
    private String name;
    private ChildResponse child;
}

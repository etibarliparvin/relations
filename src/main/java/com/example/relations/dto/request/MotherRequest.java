package com.example.relations.dto.request;

import lombok.Data;

@Data
public class MotherRequest {

    private String name;
    private ChildRequest child;
}

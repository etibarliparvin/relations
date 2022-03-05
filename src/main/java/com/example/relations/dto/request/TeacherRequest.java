package com.example.relations.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class TeacherRequest {

    private String name;
    private List<StudentRequest> students;
}

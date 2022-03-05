package com.example.relations.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class TeacherResponse {

    private Long teacher_id;
    private String name;
    private List<StudentResponse> students;
}

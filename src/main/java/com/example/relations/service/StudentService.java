package com.example.relations.service;

import com.example.relations.dto.request.StudentRequest;
import com.example.relations.dto.response.StudentResponse;

public interface StudentService {

    StudentResponse create(StudentRequest request);

    StudentResponse findById(Long id);
}

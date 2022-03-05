package com.example.relations.service;

import com.example.relations.dto.request.TeacherRequest;
import com.example.relations.dto.response.TeacherResponse;
import com.example.relations.entity.manyToMany.Teacher;

public interface TeacherService {

    TeacherResponse create(TeacherRequest request);

    TeacherResponse findById(Long id);
}

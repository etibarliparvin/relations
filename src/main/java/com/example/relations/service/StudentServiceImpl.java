package com.example.relations.service;

import com.example.relations.dto.request.StudentRequest;
import com.example.relations.dto.response.StudentResponse;
import com.example.relations.mapper.StudentMapper;
import com.example.relations.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{

    private final StudentRepository repository;
    private final StudentMapper mapper;

    @Override
    public StudentResponse create(StudentRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public StudentResponse findById(Long id) {
        return mapper.toResponse(repository.getById(id));
    }
}

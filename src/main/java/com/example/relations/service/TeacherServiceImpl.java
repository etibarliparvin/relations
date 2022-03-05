package com.example.relations.service;

import com.example.relations.dto.request.TeacherRequest;
import com.example.relations.dto.response.TeacherResponse;
import com.example.relations.entity.manyToMany.Teacher;
import com.example.relations.mapper.TeacherMapper;
import com.example.relations.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService{

    private final TeacherRepository repository;
    private final TeacherMapper mapper;

    @Override
    public TeacherResponse create(TeacherRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public TeacherResponse findById(Long id) {
        return mapper.toResponse(repository.getById(id));
    }
}

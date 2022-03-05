package com.example.relations.service;

import com.example.relations.dto.request.MotherRequest;
import com.example.relations.dto.response.MotherResponse;
import com.example.relations.mapper.MotherMapper;
import com.example.relations.repository.MotherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MotherServiceImpl implements MotherService {

    private final MotherRepository repository;
    private final MotherMapper mapper;

    @Override
    public MotherResponse create(MotherRequest request) {
        return mapper.toResponse(repository.save(mapper.toEntity(request)));
    }

    @Override
    public MotherResponse findById(Long id) {
        return mapper.toResponse(repository.getById(id));
    }
}

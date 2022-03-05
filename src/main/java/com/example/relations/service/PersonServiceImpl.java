package com.example.relations.service;

import com.example.relations.dto.request.PersonRequest;
import com.example.relations.dto.response.PersonResponse;
import com.example.relations.mapper.PersonMapper;
import com.example.relations.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    @Override
    public PersonResponse create(PersonRequest request) {
        return personMapper.toResponse(personRepository.save(personMapper.toEntity(request)));
    }

    @Override
    public PersonResponse findById(Long id) {
        return personMapper.toResponse(personRepository.getById(id));
    }
}

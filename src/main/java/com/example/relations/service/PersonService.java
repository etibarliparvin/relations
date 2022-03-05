package com.example.relations.service;

import com.example.relations.dto.request.PersonRequest;
import com.example.relations.dto.response.PersonResponse;

public interface PersonService {

    PersonResponse create(PersonRequest request);

    PersonResponse findById(Long id);
}

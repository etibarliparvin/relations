package com.example.relations.service;

import com.example.relations.dto.request.MotherRequest;
import com.example.relations.dto.response.MotherResponse;

public interface MotherService {

    MotherResponse create(MotherRequest request);

    MotherResponse findById(Long id);
}

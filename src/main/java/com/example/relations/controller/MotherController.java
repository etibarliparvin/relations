package com.example.relations.controller;

import com.example.relations.dto.request.MotherRequest;
import com.example.relations.service.MotherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mother")
@RequiredArgsConstructor
public class MotherController {

    private final MotherService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody MotherRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
}

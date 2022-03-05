package com.example.relations.mapper;

import com.example.relations.dto.request.StudentRequest;
import com.example.relations.dto.response.StudentResponse;
import com.example.relations.entity.manyToMany.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    Student toEntity(StudentRequest request);

    StudentResponse toResponse(Student student);
}

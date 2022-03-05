package com.example.relations.mapper;

import com.example.relations.dto.request.TeacherRequest;
import com.example.relations.dto.response.TeacherResponse;
import com.example.relations.entity.manyToMany.Teacher;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeacherMapper {

    Teacher toEntity(TeacherRequest request);

    TeacherResponse toResponse(Teacher teacher);
}

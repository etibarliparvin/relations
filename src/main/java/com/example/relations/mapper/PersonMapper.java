package com.example.relations.mapper;

import com.example.relations.dto.request.PersonRequest;
import com.example.relations.dto.response.PersonResponse;
import com.example.relations.entity.oneToMany.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    Person toEntity(PersonRequest request);

    PersonResponse toResponse(Person person);
}

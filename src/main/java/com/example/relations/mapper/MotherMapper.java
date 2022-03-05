package com.example.relations.mapper;

import com.example.relations.dto.request.MotherRequest;
import com.example.relations.dto.response.MotherResponse;
import com.example.relations.entity.oneToOne.Mother;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MotherMapper {

    Mother toEntity(MotherRequest request);

    MotherResponse toResponse(Mother mother);
}

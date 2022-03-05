package com.example.relations.mapper;

import com.example.relations.dto.request.CarRequest;
import com.example.relations.dto.response.CarResponse;
import com.example.relations.entity.oneToMany.Car;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarMapper {

    Car toEntity(CarRequest request);

    CarResponse toResponse(Car car);
}

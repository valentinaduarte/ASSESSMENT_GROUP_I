package com.riwi.assentment_project.infraestructure.mappers;


import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import com.riwi.assentment_project.api.dto.response.ProductResponse;
import com.riwi.assentment_project.domain.entities.Product;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {
    ProductResponse entityToResponse(Product entity);
}

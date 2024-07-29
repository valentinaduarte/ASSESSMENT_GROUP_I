package com.riwi.assentment_project.util.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import com.riwi.assentment_project.api.dto.request.UserRequest;
import com.riwi.assentment_project.api.dto.response.UserBasicResponse;
import com.riwi.assentment_project.domain.entities.UserEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    
    UserEntity requestToEntity(UserRequest request);

    UserBasicResponse entityToResp(UserEntity entity);
}

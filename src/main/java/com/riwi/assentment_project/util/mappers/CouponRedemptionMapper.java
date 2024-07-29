package com.riwi.assentment_project.util.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import com.riwi.assentment_project.api.dto.request.CouponRedemptionRequest;
import com.riwi.assentment_project.domain.entities.CouponRedemption;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CouponRedemptionMapper {
    
    CouponRedemption requestToEntity(CouponRedemptionRequest request);

}

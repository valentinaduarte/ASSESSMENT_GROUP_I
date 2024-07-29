package com.riwi.assentment_project.util.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import com.riwi.assentment_project.api.dto.request.CouponRequest;
import com.riwi.assentment_project.api.dto.request.CouponRequestUpdate;
import com.riwi.assentment_project.api.dto.response.CouponResponse;
import com.riwi.assentment_project.domain.entities.Coupon;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CouponMapper {
    CouponResponse entityToResponse(Coupon coupon);

    Coupon requestToEntity(CouponRequest couponRequest);

    Coupon requestUpdateToEntity(CouponRequestUpdate couponRequestUpdate);

}

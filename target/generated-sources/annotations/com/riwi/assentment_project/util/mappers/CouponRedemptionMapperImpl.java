package com.riwi.assentment_project.util.mappers;

import com.riwi.assentment_project.api.dto.request.CouponRedemptionRequest;
import com.riwi.assentment_project.domain.entities.CouponRedemption;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-29T13:44:22-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class CouponRedemptionMapperImpl implements CouponRedemptionMapper {

    @Override
    public CouponRedemption requestToEntity(CouponRedemptionRequest request) {
        if ( request == null ) {
            return null;
        }

        CouponRedemption.CouponRedemptionBuilder couponRedemption = CouponRedemption.builder();

        return couponRedemption.build();
    }
}

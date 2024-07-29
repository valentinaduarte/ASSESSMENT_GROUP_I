package com.riwi.assentment_project.util.mappers;

import com.riwi.assentment_project.api.dto.request.CouponRequest;
import com.riwi.assentment_project.api.dto.request.CouponRequestUpdate;
import com.riwi.assentment_project.api.dto.response.CouponResponse;
import com.riwi.assentment_project.domain.entities.Coupon;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-29T12:43:06-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class CouponMapperImpl implements CouponMapper {

    @Override
    public CouponResponse entityToResponse(Coupon coupon) {
        if ( coupon == null ) {
            return null;
        }

        CouponResponse.CouponResponseBuilder<?, ?> couponResponse = CouponResponse.builder();

        couponResponse.discount_percent( coupon.getDiscount_percent() );
        couponResponse.expire_date( coupon.getExpire_date() );
        couponResponse.id( coupon.getId() );
        couponResponse.start_date( coupon.getStart_date() );
        couponResponse.status( coupon.isStatus() );

        return couponResponse.build();
    }

    @Override
    public Coupon requestToEntity(CouponRequest couponRequest) {
        if ( couponRequest == null ) {
            return null;
        }

        Coupon.CouponBuilder coupon = Coupon.builder();

        coupon.discount_percent( couponRequest.getDiscount_percent() );
        coupon.expire_date( couponRequest.getExpire_date() );

        return coupon.build();
    }

    @Override
    public Coupon requestUpdateToEntity(CouponRequestUpdate couponRequestUpdate) {
        if ( couponRequestUpdate == null ) {
            return null;
        }

        Coupon.CouponBuilder coupon = Coupon.builder();

        coupon.discount_percent( couponRequestUpdate.getDiscount_percent() );
        coupon.expire_date( couponRequestUpdate.getExpire_date() );
        coupon.status( couponRequestUpdate.isStatus() );

        return coupon.build();
    }
}

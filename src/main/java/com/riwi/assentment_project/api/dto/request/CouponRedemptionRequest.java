package com.riwi.assentment_project.api.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CouponRedemptionRequest {

    private Long user_id;

    private Long coupon_id;

    private Long product_id;

}

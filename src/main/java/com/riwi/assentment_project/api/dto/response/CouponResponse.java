package com.riwi.assentment_project.api.dto.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class CouponResponse {
    private Long id;
    private double discount_percent;
    private LocalDateTime start_date;
    private LocalDateTime expire_date;
    private boolean status;
}

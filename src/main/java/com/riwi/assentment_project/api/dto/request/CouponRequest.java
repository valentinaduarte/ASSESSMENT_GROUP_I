package com.riwi.assentment_project.api.dto.request;

import java.time.LocalDateTime;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CouponRequest {
    // @Size(min = 0, max = 100, message = "Discount Percent must be between 0 and
    // 100")
    @NotNull(message = "Discount Percent cannot be null")
    private double discount_percent;

    @FutureOrPresent(message = "Expire Date cannot be in the future")
    private LocalDateTime expire_date;

}

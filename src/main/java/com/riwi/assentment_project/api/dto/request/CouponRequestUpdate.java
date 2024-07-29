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
public class CouponRequestUpdate {
    @NotNull(message = "Discount Percent cannot be null")
    private double discount_percent;

    @FutureOrPresent(message = "Expire Date cannot be in the future")
    private LocalDateTime expire_date;

    // @Pattern(regexp = "^(true|false)$", message = "tatus must be true or false")
    private boolean status;

}

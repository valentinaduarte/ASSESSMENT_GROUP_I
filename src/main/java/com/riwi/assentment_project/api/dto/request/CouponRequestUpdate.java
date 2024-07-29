package com.riwi.assentment_project.api.dto.request;

import java.time.LocalDateTime;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CouponRequestUpdate {
    @Size(min = 0, max = 100, message = "Discount Percent must be between 0 and 100")
    @NotNull(message = "Discount Percent cannot be null")
    private float discount_percent;

    @FutureOrPresent(message = "Expire Date cannot be in the future")
    private LocalDateTime expire_date;

    @NotBlank(message = "Status cannot be blank")
    private boolean status;

}

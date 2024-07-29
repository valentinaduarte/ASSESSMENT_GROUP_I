package com.riwi.assentment_project.api.dto.request;

import com.riwi.assentment_project.util.enums.Rol;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    @NotBlank(message = "The name is required")
    @Size(min = 4, max = 50, message = "The name must contain between 4 and 50 characters")
    private String name;
    @NotBlank(message = "The lastname is required")
    private String lastname;
    @NotBlank(message = "The rol is required")
    private Rol rol;
    @Email
    @NotBlank(message = "The email is required")
    private String email;
    @NotBlank(message = "The password is required")
    private String password;
}

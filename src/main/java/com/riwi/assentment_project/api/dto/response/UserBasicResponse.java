package com.riwi.assentment_project.api.dto.response;

import com.riwi.assentment_project.util.enums.Rol;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserBasicResponse {
    private Long id;
    private String name;
    private String lastname;
    private Rol rol;
    private String email;
}

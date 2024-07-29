package com.riwi.assentment_project.domain.entities;

import java.time.LocalDateTime;

import com.riwi.assentment_project.util.enums.Rol;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity(name = "user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastname;
    @Enumerated(EnumType.STRING)
    private Rol rol;
    private String email;
    private String password;
    @Builder.Default
    private LocalDateTime dateRegister = LocalDateTime.now();
}

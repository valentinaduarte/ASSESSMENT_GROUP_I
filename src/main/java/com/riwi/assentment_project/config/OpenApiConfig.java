package com.riwi.assentment_project.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

/**
 * Configuracion de swagger
 */
@Configuration
@OpenAPIDefinition(info = @Info(title = "CoupoRiwi API", version = "1", description = "API For the CoupoRiwi application."))
public class OpenApiConfig {

}

package com.riwi.assentment_project.api.controllers;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.assentment_project.api.dto.response.ProductResponse;
import com.riwi.assentment_project.infraestructure.abstract_services.IProductService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {

    private final IProductService productservice;

    /*----------------------
     * GET ALL ROLES
     * ---------------------
     */
    // SWAGGER
    @Operation(
    summary = "Get all products",
    description = "Retrieve a paginated list of all products",
    parameters = {
        @Parameter(name = "page",
                description = "Page number",
                schema = @Schema(
                type = "integer",
                defaultValue = "1")),
        @Parameter(name = "size",
                description = "Page size",
                schema = @Schema(
                type = "integer",
                defaultValue = "10")),
    },
    responses = {
        @ApiResponse(responseCode = "200", description = "SUCCESSFUL"),
        @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
        @ApiResponse(responseCode = "401", description = "NOT AUTHORIZED"),
        @ApiResponse(responseCode = "403", description = "FORBIDDEN ACCESS"),
        @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR")
    })
    @GetMapping
    public ResponseEntity<Page<ProductResponse>> getAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        Page<ProductResponse> responses = this.productservice.getAll(page, size);
        return ResponseEntity.ok(responses);
    }
}

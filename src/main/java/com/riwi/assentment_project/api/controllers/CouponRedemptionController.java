package com.riwi.assentment_project.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.assentment_project.api.dto.request.CouponRedemptionRequest;
import com.riwi.assentment_project.api.dto.request.UserRequest;
import com.riwi.assentment_project.api.dto.response.CouponResponse;
import com.riwi.assentment_project.api.dto.response.UserBasicResponse;
import com.riwi.assentment_project.domain.entities.CouponRedemption;
import com.riwi.assentment_project.infraestructure.abstract_services.ICouponRedemptionService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/couponRedemption")
@AllArgsConstructor
public class CouponRedemptionController {

    @Autowired
    private final ICouponRedemptionService couponRedemptionService;

    @Operation(summary = "Creates a coupon Redeption")
    @PostMapping
    public ResponseEntity<CouponRedemption> create(@Validated @RequestBody CouponRedemptionRequest request){
        return ResponseEntity.ok(this.couponRedemptionService.create(request));
    }

    @Operation(summary = "Delete a coupon Redeption")
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.couponRedemptionService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @Operation(summary = "Get all coupons redemptions in the system and return the list of coupons")
    @GetMapping
    public ResponseEntity<Page<CouponRedemption>> getAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        Page<CouponRedemption> response = couponRedemptionService.getAll(page, size);
        return ResponseEntity.ok(response);
    }


}

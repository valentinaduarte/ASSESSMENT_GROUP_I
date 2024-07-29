package com.riwi.assentment_project.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.assentment_project.api.dto.request.CouponRequest;
import com.riwi.assentment_project.api.dto.request.CouponRequestUpdate;
import com.riwi.assentment_project.api.dto.response.CouponResponse;
import com.riwi.assentment_project.infraestructure.abstract_services.ICouponService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/coupons")
@AllArgsConstructor
public class CouponController {

    @Autowired
    private final ICouponService couponService;

    @PostMapping
    public ResponseEntity<CouponResponse> create(@Validated @RequestBody CouponRequest request) {
        CouponResponse response = couponService.create(request);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(Long id) {
        couponService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<CouponResponse> update(@Validated @RequestBody CouponRequestUpdate request, Long id) {
        CouponResponse response = couponService.update(request, id);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<Page<CouponResponse>> getAll(int page, int size) {
        Page<CouponResponse> response = couponService.getAll(page, size);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CouponResponse> getById(Long id) {
        CouponResponse response = couponService.getById(id);
        return ResponseEntity.ok(response);
    }

}

package com.riwi.assentment_project.infraestructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.riwi.assentment_project.api.dto.request.CouponRedemptionRequest;
import com.riwi.assentment_project.domain.entities.CouponRedemption;
import com.riwi.assentment_project.domain.repositories.CouponRedemptionRepository;
import com.riwi.assentment_project.infraestructure.abstract_services.ICouponRedemptionService;
import com.riwi.assentment_project.util.mappers.CouponRedemptionMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CouponRedemptionService implements ICouponRedemptionService{

    @Autowired
    private final CouponRedemptionRepository couponRedemptionRepository;

    @Autowired
    private final CouponRedemptionMapper couponRedemptionMapper;
    
    @Override
    public CouponRedemption create(CouponRedemptionRequest request) {
        CouponRedemption redemption = this.couponRedemptionMapper.requestToEntity(request);
        return this.couponRedemptionRepository.save(redemption);
    }

    @Override
    public CouponRedemption delete(Long id) {
        CouponRedemption couponRedemption = this.findById(id);
        this.couponRedemptionRepository.delete(couponRedemption);
        return couponRedemption;
    }

    @Override
    public Page<CouponRedemption> getAll(int page, int size) {
        if(page < 0) page = 0;

        PageRequest pageable = PageRequest.of(page, size);

        return this.couponRedemptionRepository.findAll(pageable);
    }

    private CouponRedemption findById(Long id){
        return couponRedemptionRepository.findById(id).orElseThrow();
    }

}

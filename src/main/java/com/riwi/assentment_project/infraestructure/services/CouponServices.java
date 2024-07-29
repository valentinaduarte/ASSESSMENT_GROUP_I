package com.riwi.assentment_project.infraestructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.riwi.assentment_project.api.dto.request.CouponRequest;
import com.riwi.assentment_project.api.dto.response.CouponResponse;
import com.riwi.assentment_project.domain.entities.Coupon;
import com.riwi.assentment_project.domain.repositories.CouponRepository;
import com.riwi.assentment_project.infraestructure.abstract_services.ICouponService;
import com.riwi.assentment_project.util.mappers.CouponMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CouponServices implements ICouponService {

    @Autowired
    private CouponRepository couponRepository;

    @Autowired
    private CouponMapper couponMapper;

    @Override
    public CouponResponse create(CouponRequest request) {
        Coupon coupon = couponMapper.requestToEntity(request);
        return this.couponMapper.entityToResponse(this.couponRepository.save(coupon));
    }

    @Override
    public Page<CouponResponse> getAll(Pageable pageable) {
        if (page < 0) {
            page = 0;
        }

    }

    @Override
    public CouponResponse getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public CouponResponse update(CouponRequest request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public CouponResponse delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}

package com.riwi.assentment_project.infraestructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.riwi.assentment_project.api.dto.request.CouponRequest;
import com.riwi.assentment_project.api.dto.request.CouponRequestUpdate;
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
    public Page<CouponResponse> getAll(int page, int size) {

        if (page < 0) {
            page = 0;
        }
        PageRequest pagination = PageRequest.of(page, size);
        return this.couponRepository.findAll(pagination).map(couponMapper::entityToResponse);
    }

    @Override
    public CouponResponse getById(Long id) {
        return this.couponMapper.entityToResponse(this.findById(id));
    }

    @Override
    public CouponResponse update(CouponRequestUpdate request, Long id) {
        Coupon coupon = findById(id);
        Coupon couponToUpdate = couponMapper.requestUpdateToEntity(request);
        couponToUpdate.setId(coupon.getId());
        couponToUpdate.setStart_date(coupon.getStart_date());
        couponToUpdate.setExpire_date(coupon.getExpire_date());
        couponToUpdate.setStatus(coupon.isStatus());
        return this.couponMapper.entityToResponse(this.couponRepository.save(coupon));
    }

    @Override
    public CouponResponse delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    private Coupon findById(Long id) {
        return this.couponRepository.findById(id).orElseThrow();
    }
}

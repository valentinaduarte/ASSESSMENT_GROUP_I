package com.riwi.assentment_project.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.assentment_project.domain.entities.Coupon;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Long> {

}

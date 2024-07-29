package com.riwi.assentment_project.infraestructure.abstract_services;

import com.riwi.assentment_project.api.dto.request.CouponRequest;
import com.riwi.assentment_project.api.dto.request.CouponRequestUpdate;
import com.riwi.assentment_project.api.dto.response.CouponResponse;
import com.riwi.assentment_project.infraestructure.abstract_services.CRUD.Create;
import com.riwi.assentment_project.infraestructure.abstract_services.CRUD.Delete;
import com.riwi.assentment_project.infraestructure.abstract_services.CRUD.Read;
import com.riwi.assentment_project.infraestructure.abstract_services.CRUD.ReadAll;
import com.riwi.assentment_project.infraestructure.abstract_services.CRUD.Update;

public interface ICouponService extends Create<CouponRequest, CouponResponse>, ReadAll<CouponResponse>,
        Read<CouponResponse, Long>, Update<CouponRequestUpdate, CouponResponse, Long>, Delete<CouponResponse, Long> {

}

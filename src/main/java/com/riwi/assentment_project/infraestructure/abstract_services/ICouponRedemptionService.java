package com.riwi.assentment_project.infraestructure.abstract_services;

import com.riwi.assentment_project.api.dto.request.CouponRedemptionRequest;
import com.riwi.assentment_project.domain.entities.CouponRedemption;
import com.riwi.assentment_project.infraestructure.abstract_services.CRUD.Create;
import com.riwi.assentment_project.infraestructure.abstract_services.CRUD.Delete;
import com.riwi.assentment_project.infraestructure.abstract_services.CRUD.ReadAll;

public interface ICouponRedemptionService extends 
                                            Create<CouponRedemptionRequest, CouponRedemption>, 
                                            Delete<CouponRedemption, Long>, 
                                            ReadAll<CouponRedemption>
{
    
}

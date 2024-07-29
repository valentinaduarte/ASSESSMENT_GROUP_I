package com.riwi.assentment_project.infraestructure.abstract_services;

import com.riwi.assentment_project.api.dto.request.UserRequest;
import com.riwi.assentment_project.api.dto.response.UserBasicResponse;
import com.riwi.assentment_project.infraestructure.abstract_services.CRUD.Create;
import com.riwi.assentment_project.infraestructure.abstract_services.CRUD.Delete;
import com.riwi.assentment_project.infraestructure.abstract_services.CRUD.Read;
import com.riwi.assentment_project.infraestructure.abstract_services.CRUD.ReadAll;
import com.riwi.assentment_project.infraestructure.abstract_services.CRUD.Update;

public interface IUserService extends Create<UserRequest, UserBasicResponse>,
                                            Update<UserRequest,UserBasicResponse, Long>,
                                            Delete<UserBasicResponse,Long>,
                                            Read<UserBasicResponse, Long>,
                                            ReadAll<UserBasicResponse>{
    
}

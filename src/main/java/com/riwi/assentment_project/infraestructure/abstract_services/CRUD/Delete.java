package com.riwi.assentment_project.infraestructure.abstract_services.CRUD;

public interface Delete<Response, ID> {

    Response delete(ID id);
    
}
package com.riwi.assentment_project.infraestructure.abstract_services.CRUD;

public interface Read<Response, ID> {

    Response getById(ID id);
    
}
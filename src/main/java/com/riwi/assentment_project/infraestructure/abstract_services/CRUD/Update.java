package com.riwi.assentment_project.infraestructure.abstract_services.CRUD;

public interface Update<Request, Response, ID> {

    Response update(Request request, ID id);
    
}
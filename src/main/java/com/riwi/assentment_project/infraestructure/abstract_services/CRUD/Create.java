package com.riwi.assentment_project.infraestructure.abstract_services.CRUD;


public interface Create<Request, Response> {

    Response create(Request request);
    
}
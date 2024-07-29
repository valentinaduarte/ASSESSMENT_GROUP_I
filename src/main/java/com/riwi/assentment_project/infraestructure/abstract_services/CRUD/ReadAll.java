package com.riwi.assentment_project.infraestructure.abstract_services.CRUD;

import org.springframework.data.domain.Page;

public interface ReadAll<Response> {

    Page<Response> getAll(int page, int size);
    
}
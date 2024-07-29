package com.riwi.assentment_project.infraestructure.abstract_services.CRUD;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ReadAll<Response> {

    Page<Response> getAll(Pageable pageable);

}
package com.riwi.assentment_project.infraestructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.riwi.assentment_project.api.dto.response.ProductResponse;
import com.riwi.assentment_project.domain.repositories.ProductRepository;
import com.riwi.assentment_project.infraestructure.abstract_services.IProductService;
import com.riwi.assentment_project.infraestructure.mappers.ProductMapper;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class ProductService implements IProductService {
    
    @Autowired
    private final ProductRepository productRepository;

    @Autowired
    private final ProductMapper productMapper;

    @Override
    public Page<ProductResponse> getAll(int page, int size) {
        if (page < 0)
            page = 0;

        PageRequest pageable = PageRequest.of(page, size);

        return productRepository.findAll(pageable).map(this.productMapper::entityToResponse);
    
    }

}

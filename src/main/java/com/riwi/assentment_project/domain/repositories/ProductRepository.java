package com.riwi.assentment_project.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.assentment_project.domain.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
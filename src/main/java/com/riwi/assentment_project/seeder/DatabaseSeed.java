package com.riwi.assentment_project.seeder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.riwi.assentment_project.domain.entities.Product;
import com.riwi.assentment_project.domain.repositories.ProductRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@AllArgsConstructor
@Slf4j
public class DatabaseSeed implements CommandLineRunner {

    @Autowired
    private final ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        log.info("Seeding Product database Executed");

        if (this.productRepository.count() > 0)
            return;

        Product Product1 = Product.builder()
                .name("BREAD")
                .price(50.0f)
                .stock(10)
                .build();

        Product Product2 = Product.builder()
                .name("LETTUCE")
                .price(100.0f)
                .stock(20)
                .build();
        
        Product Product3 = Product.builder()
                .name("TOMATO")
                .price(3.0f)
                .stock(10)
                .build();

        Product Product4 = Product.builder()
                .name("ONION")
                .price(2.0f)
                .stock(10)
                .build();

        Product Product5 = Product.builder()
                .name("POTATO")
                .price(1.0f)
                .stock(10)
                .build();

        Product Product6 = Product.builder()
                .name("CABBAGE")
                .price(1.0f)
                .stock(10)
                .build();
        
        Product Product7 = Product.builder()
                .name("SPINACH")
                .price(3.0f)
                .stock(10)
                .build();

        Product Product8 = Product.builder()
                .name("MUSHROOM")
                .price(2.0f)
                .stock(10)
                .build();

        Product Product9 = Product.builder()
                .name("HONEY")
                .price(1.0f)
                .stock(10)
                .build();

        Product Product10 = Product.builder()
                .name("COFFEE")
                .price(1.0f)
                .stock(10)
                .build();

        productRepository.save(Product1);
        productRepository.save(Product2);
        productRepository.save(Product3);
        productRepository.save(Product4);
        productRepository.save(Product5);
        productRepository.save(Product6);
        productRepository.save(Product7);
        productRepository.save(Product8);
        productRepository.save(Product9);
        productRepository.save(Product10);
    }
}

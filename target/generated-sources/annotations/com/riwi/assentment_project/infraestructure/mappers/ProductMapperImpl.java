package com.riwi.assentment_project.infraestructure.mappers;

import com.riwi.assentment_project.api.dto.response.ProductResponse;
import com.riwi.assentment_project.domain.entities.Product;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-29T12:15:34-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductResponse entityToResponse(Product entity) {
        if ( entity == null ) {
            return null;
        }

        ProductResponse productResponse = new ProductResponse();

        productResponse.setName( entity.getName() );
        productResponse.setPrice( entity.getPrice() );
        productResponse.setStock( entity.getStock() );

        return productResponse;
    }
}

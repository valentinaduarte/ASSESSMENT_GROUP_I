package com.riwi.assentment_project.util.mappers;

import com.riwi.assentment_project.api.dto.request.UserRequest;
import com.riwi.assentment_project.api.dto.response.UserBasicResponse;
import com.riwi.assentment_project.domain.entities.UserEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-29T11:31:50-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserEntity requestToEntity(UserRequest request) {
        if ( request == null ) {
            return null;
        }

        UserEntity.UserEntityBuilder userEntity = UserEntity.builder();

        userEntity.email( request.getEmail() );
        userEntity.lastname( request.getLastname() );
        userEntity.name( request.getName() );
        userEntity.password( request.getPassword() );
        userEntity.rol( request.getRol() );

        return userEntity.build();
    }

    @Override
    public UserBasicResponse entityToResp(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        UserBasicResponse.UserBasicResponseBuilder userBasicResponse = UserBasicResponse.builder();

        userBasicResponse.email( entity.getEmail() );
        userBasicResponse.id( entity.getId() );
        userBasicResponse.lastname( entity.getLastname() );
        userBasicResponse.name( entity.getName() );
        userBasicResponse.rol( entity.getRol() );

        return userBasicResponse.build();
    }
}
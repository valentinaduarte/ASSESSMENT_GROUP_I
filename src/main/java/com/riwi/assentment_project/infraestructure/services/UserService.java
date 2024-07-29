package com.riwi.assentment_project.infraestructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.riwi.assentment_project.api.dto.request.UserRequest;
import com.riwi.assentment_project.api.dto.response.UserBasicResponse;
import com.riwi.assentment_project.domain.repositories.UserRepository;
import com.riwi.assentment_project.infraestructure.abstract_services.IUserService;
import com.riwi.assentment_project.util.mappers.UserMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService implements IUserService{
    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private final UserMapper userMapper; 
    @Override
    public UserBasicResponse create(UserRequest request) {
        return this.userMapper.entityToResp(this.userRepository.save(this.userMapper.requestToEntity(request)));
    }

    @Override
    public UserBasicResponse update(UserRequest request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public UserBasicResponse delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public UserBasicResponse getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public Page<UserBasicResponse> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
    
}

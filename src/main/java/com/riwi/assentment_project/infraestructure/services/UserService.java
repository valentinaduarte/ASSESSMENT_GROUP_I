package com.riwi.assentment_project.infraestructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.riwi.assentment_project.api.dto.request.UserRequest;
import com.riwi.assentment_project.api.dto.response.UserBasicResponse;
import com.riwi.assentment_project.domain.entities.User;
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
        User userToUpdate = this.findById(id);

        userToUpdate.setName(request.getName());
        userToUpdate.setLastname(request.getLastname());
        userToUpdate.setEmail(request.getEmail());
        userToUpdate.setRol(request.getRol());
        
        return this.userMapper.entityToResp(userRepository.save(userToUpdate));
    }

    @Override
    public UserBasicResponse delete(Long id) {
        User userToDelete = this.findById(id);
        this.userRepository.delete(userToDelete);
        return this.userMapper.entityToResp(userToDelete);
    }

    @Override
    public UserBasicResponse getById(Long id) {
        return this.userMapper.entityToResp(this.findById(id));
    }

    @Override
    public Page<UserBasicResponse> getAll(int page, int size) {

        if(page < 0) page = 0;

        PageRequest pageable = PageRequest.of(page, size);

        return this.userRepository.findAll(pageable).map(this.userMapper::entityToResp);
    }

    public User findById(Long id){
        return userRepository.findById(id).orElseThrow();
    }
    
}

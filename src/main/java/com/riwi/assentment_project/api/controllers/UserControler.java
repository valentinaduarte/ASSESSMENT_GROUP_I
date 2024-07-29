package com.riwi.assentment_project.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.assentment_project.api.dto.request.UserRequest;
import com.riwi.assentment_project.api.dto.response.UserBasicResponse;
import com.riwi.assentment_project.infraestructure.abstract_services.IUserService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/users")
@AllArgsConstructor
@Tag(name = "Users")
public class UserControler {
    @Autowired
    private final IUserService userService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<UserBasicResponse> findById(@PathVariable Long id){
        return ResponseEntity.ok(this.userService.getById(id));
    }

    @PostMapping
    public ResponseEntity<UserBasicResponse> create(@Validated @RequestBody UserRequest request){
        return ResponseEntity.ok(this.userService.create(request));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.userService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<UserBasicResponse> update(@PathVariable Long id, @RequestBody UserRequest request){
        return ResponseEntity.ok(this.userService.update(request, id));
    }
}

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

import io.swagger.v3.oas.annotations.Operation;
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
    @Operation(summary = "Find by id a user in the system")
    public ResponseEntity<UserBasicResponse> findById(@PathVariable Long id){
        return ResponseEntity.ok(this.userService.getById(id));
    }

    @PostMapping
    @Operation(summary = "Create a user in the system and return the user created")
    public ResponseEntity<UserBasicResponse> create(@Validated @RequestBody UserRequest request){
        return ResponseEntity.ok(this.userService.create(request));
    }

    @DeleteMapping(path = "/{id}")
    @Operation(summary = "Delete a user in the system whit the id")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.userService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @Operation(summary = "Update a user in the system and return the user changed")
    @PutMapping(path = "/{id}")
    public ResponseEntity<UserBasicResponse> update(@PathVariable Long id, @RequestBody UserRequest request){
        return ResponseEntity.ok(this.userService.update(request, id));
    }
}

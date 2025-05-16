package com.project.bicicoletivo.controllers;


import com.project.bicicoletivo.dto.CreateUserDTO;
import com.project.bicicoletivo.dto.UserDTO;
import com.project.bicicoletivo.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/users")
public class UserControllers {

    @Autowired
    private UserService service;

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_CLIENT')")
    @GetMapping(value = "/me")
    public ResponseEntity<UserDTO> getMe(){
        UserDTO dto = service.getMe();
        return ResponseEntity.ok(dto);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
        UserDTO user = service.findById(id);
        return ResponseEntity.ok(user);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping
    public ResponseEntity<Page<UserDTO>> findAll(
            @RequestParam(required = false) String name,
            @PageableDefault(size = 10, sort = "name") Pageable pageable) {
        Page<UserDTO> users = service.findAll(name, pageable);
        return ResponseEntity.ok(users);
    }

    @PostMapping
    public ResponseEntity<UserDTO> insert(@Valid @RequestBody CreateUserDTO dto) {
        UserDTO createdUser = service.insert(dto);
        return ResponseEntity.ok(createdUser);
    }

    @PreAuthorize("authentication.principal.id == #userId")
    @PutMapping(value = "/{userId}/bikes/{bikeId}")
    public ResponseEntity<UserDTO> updateBike(
            @PathVariable Long userId,
            @PathVariable Long bikeId,
            @Valid @RequestBody CreateUserDTO dto) {
        UserDTO updatedUser = service.updateBike(userId, bikeId, dto);
        return ResponseEntity.ok(updatedUser);
    }

}

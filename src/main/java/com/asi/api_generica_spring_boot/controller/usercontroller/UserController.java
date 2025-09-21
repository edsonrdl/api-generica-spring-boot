package com.asi.api_generica_spring_boot.controller.usercontroller;


import com.asi.api_generica_spring_boot.domain.entities.user.UserEntity;
import com.asi.api_generica_spring_boot.services.userservice.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<UserEntity> createUser(@Valid @RequestBody UserEntity userEntity) {
        UserEntity userCreate = userService.createUser(userEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreate);

    }

    @GetMapping("/buscar_user-{id}")
    public ResponseEntity<UserEntity> createUser(@PathVariable Long id) {
        UserEntity userCreate = userService.buscarUser(id);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreate);

    }

    @PutMapping("/atualizar-user-{id}")
    public ResponseEntity<UserEntity> updateUser(@PathVariable Long id, @Valid @RequestBody UserEntity userEntity) {
        UserEntity userCreate = userService.updateUser(id,userEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreate);

    }
}

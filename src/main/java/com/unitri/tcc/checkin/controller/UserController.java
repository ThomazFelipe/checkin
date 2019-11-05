package com.unitri.tcc.checkin.controller;

import com.unitri.tcc.checkin.data.model.User;
import com.unitri.tcc.checkin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/user" )
public class UserController {

    private UserService service;

    @Autowired
    UserController( UserService service ) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity save( @RequestBody User user ) {
        return ResponseEntity.ok( service.saveAndFlush( user ) );
    }

    @PutMapping
    public ResponseEntity update( @RequestBody User user ) {
        return ResponseEntity.ok( service.saveAndFlush( user ) );
    }

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok( service.findAll() );
    }

    @GetMapping( "/{id}" )
    public ResponseEntity getOne( @PathVariable Long id ) {
        return ResponseEntity.ok( service.getOne( id ) );
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity deleteById( @PathVariable Long id ) {
        service.deleteById( id );
        return ResponseEntity.ok().build();
    }
}

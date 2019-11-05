package com.unitri.tcc.checkin.controller;

import com.unitri.tcc.checkin.service.CertifiedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/certified" )
public class CertifiedController {

    private CertifiedService service;

    @Autowired
    CertifiedController( CertifiedService service ) {
        this.service = service;
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

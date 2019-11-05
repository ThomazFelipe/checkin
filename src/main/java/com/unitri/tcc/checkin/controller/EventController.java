package com.unitri.tcc.checkin.controller;

import com.unitri.tcc.checkin.data.model.Event;
import com.unitri.tcc.checkin.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/event" )
public class EventController {

    private EventService service;

    @Autowired
    EventController( EventService service ) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity save( @RequestBody Event event ) {
        return ResponseEntity.ok( service.saveAndFlush( event ) );
    }

    @PutMapping
    public ResponseEntity update( @RequestBody Event event ) {
        return ResponseEntity.ok( service.saveAndFlush( event ) );
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

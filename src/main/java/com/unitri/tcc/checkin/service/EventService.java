package com.unitri.tcc.checkin.service;

import com.unitri.tcc.checkin.data.model.Event;

import java.util.List;

public interface EventService {

    List< Event > findAll();

    Event getOne( Long id );

    Event saveAndFlush( Event event );

    void deleteById( Long id );
}

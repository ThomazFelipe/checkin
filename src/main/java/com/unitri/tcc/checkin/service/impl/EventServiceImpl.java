package com.unitri.tcc.checkin.service.impl;

import com.unitri.tcc.checkin.data.model.Event;
import com.unitri.tcc.checkin.data.repository.EventRepository;
import com.unitri.tcc.checkin.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    private EventRepository repository;

    @Autowired
    EventServiceImpl( EventRepository repository ) {
        this.repository = repository;
    }

    @Override
    public List< Event > findAll() {
        return repository.findAll();
    }

    @Override
    public Event getOne( Long id ) {
        return repository.getOne( id );
    }

    @Override
    public Event saveAndFlush( Event event ) {
        return repository.saveAndFlush( event );
    }

    @Override
    public void deleteById( Long id ) {
        repository.deleteById( id );
    }
}

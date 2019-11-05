package com.unitri.tcc.checkin.service.impl;

import com.unitri.tcc.checkin.data.model.User;
import com.unitri.tcc.checkin.data.repository.UserRepository;
import com.unitri.tcc.checkin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    @Autowired
    UserServiceImpl( UserRepository repository ) {
        this.repository = repository;
    }

    @Override
    public List< User > findAll() {
        return repository.findAll();
    }

    @Override
    public User getOne( Long id ) {
        return repository.getOne( id );
    }

    @Override
    public User saveAndFlush( User user ) {
        return repository.saveAndFlush( user );
    }

    @Override
    public void deleteById( Long id ) {
        repository.deleteById( id );
    }
}

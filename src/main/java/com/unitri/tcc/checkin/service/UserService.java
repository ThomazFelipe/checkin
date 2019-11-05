package com.unitri.tcc.checkin.service;

import com.unitri.tcc.checkin.data.model.User;

import java.util.List;

public interface UserService {

    List< User > findAll();

    User saveAndFlush( User user );

    User getOne( Long id );

    void deleteById( Long id );
}

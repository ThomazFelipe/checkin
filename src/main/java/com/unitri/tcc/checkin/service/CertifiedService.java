package com.unitri.tcc.checkin.service;

import com.unitri.tcc.checkin.data.model.Certified;

import java.util.List;

public interface CertifiedService {

    Certified generate();

    List< Certified > findAll();

    Certified getOne( Long id );

    void deleteById( Long id );
}

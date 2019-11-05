package com.unitri.tcc.checkin.service.impl;

import com.unitri.tcc.checkin.data.model.Certified;
import com.unitri.tcc.checkin.data.repository.CertifiedRepository;
import com.unitri.tcc.checkin.service.CertifiedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertifiedServiceImpl implements CertifiedService {

    private CertifiedRepository repository;

    @Autowired
    CertifiedServiceImpl( CertifiedRepository repository ) {
        this.repository = repository;
    }

    @Override
    public Certified generate() {
        return null;
    }

    @Override
    public List< Certified > findAll() {
        return repository.findAll();
    }

    @Override
    public Certified getOne( Long id ) {
        return repository.getOne( id );
    }

    @Override
    public void deleteById( Long id ) {
        repository.deleteById( id );
    }
}

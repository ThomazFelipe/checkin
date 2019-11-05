package com.unitri.tcc.checkin.data.repository;

import com.unitri.tcc.checkin.data.model.Certified;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertifiedRepository extends JpaRepository< Certified, Long > {
}

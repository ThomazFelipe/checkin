package com.unitri.tcc.checkin.data.repository;

import com.unitri.tcc.checkin.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository< User, Long > {
}

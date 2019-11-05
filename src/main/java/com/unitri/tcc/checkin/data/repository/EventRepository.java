package com.unitri.tcc.checkin.data.repository;

import com.unitri.tcc.checkin.data.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository< Event, Long > {
}

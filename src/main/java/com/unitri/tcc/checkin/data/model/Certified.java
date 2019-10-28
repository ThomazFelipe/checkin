package com.unitri.tcc.checkin.data.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table( name = "CHECK_CERTIFIED" )
public class Certified implements Serializable {

    @Id
    @Column( name = "ID" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

//    @Column( name = "USER_ID" )
//    private User user;
//
//    @Column( name = "EVENT_ID" )
//    private Event event;

    @Column( name = "CREATED_AT" )
    private LocalDate createdAt;

    @Column( name = "CERTIFIED" )
    private byte[] certified;

    public Long getId() {
        return id;
    }

    public Certified setId( Long id ) {
        this.id = id;
        return this;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public Certified setUser( User user ) {
//        this.user = user;
//        return this;
//    }
//
//    public Event getEvent() {
//        return event;
//    }
//
//    public Certified setEvent( Event event ) {
//        this.event = event;
//        return this;
//    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public Certified setCreatedAt( LocalDate createdAt ) {
        this.createdAt = createdAt;
        return this;
    }

    public byte[] getCertified() {
        return certified;
    }

    public Certified setCertified( byte[] certified ) {
        this.certified = certified;
        return this;
    }
}

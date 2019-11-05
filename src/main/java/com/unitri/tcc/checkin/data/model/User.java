package com.unitri.tcc.checkin.data.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table( name = "CHECK_USER" )
public class User implements Serializable {

    @Id
    @Column( name = "ID" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column( name = "NAME", length = 50 )
    private String name;

    @Column( name = "TYPE" )
    @Enumerated( EnumType.STRING )
    private UserType type;

    @Column( name = "CPF" )
    private String cpf;

    @Column( name = "REGISTER" )
    private String register;

    @OneToMany( mappedBy = "creator" )
    private List< Event > events;

    @OneToMany( mappedBy = "user" )
    private List< Certified > certifiedList;

    public Long getId() {
        return id;
    }

    public User setId( Long id ) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName( String name ) {
        this.name = name;
        return this;
    }

    public UserType getType() {
        return type;
    }

    public User setType( UserType type ) {
        this.type = type;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public User setCpf( String cpf ) {
        this.cpf = cpf;
        return this;
    }

    public String getRegister() {
        return register;
    }

    public User setRegister( String register ) {
        this.register = register;
        return this;
    }

    public List< Event > getEvents() {
        return events;
    }

    public User setEvents( List< Event > events ) {
        this.events = events;
        return this;
    }

    public List< Certified > getCertifiedList() {
        return certifiedList;
    }

    public User setCertifiedList( List< Certified > certifiedList ) {
        this.certifiedList = certifiedList;
        return this;
    }
}

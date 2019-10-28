package com.unitri.tcc.checkin.data.model;

import javax.persistence.*;
import java.io.Serializable;

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
}

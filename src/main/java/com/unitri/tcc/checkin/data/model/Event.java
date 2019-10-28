package com.unitri.tcc.checkin.data.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table( name = "CHECK_EVENT" )
public class Event implements Serializable {

    @Id
    @Column( name = "ID" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column( name = "NAME" )
    private String name;

    @Column( name = "INITIAL_DATE" )
    private LocalDate initialDate;

    @Column( name = "FINAL_DATE" )
    private LocalDate finalDate;

    @Column( name = "IS_TWO_CHECKS")
    private Boolean isTwoChecks;

    @Column( name = "RADIUS" )
    private Integer radius;

    @Column( name = "LATITUDE" )
    private Double latitude;

    @Column( name = "LONGITUDE" )
    private Double longitude;

//    @Column( name = "CREATOR" )
//    private User creator;

    @Column( name = "ADDITIONAL_INFO" )
    private String additionalInfo;

    public Long getId() {
        return id;
    }

    public Event setId( Long id ) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Event setName( String name ) {
        this.name = name;
        return this;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public Event setInitialDate( LocalDate initialDate ) {
        this.initialDate = initialDate;
        return this;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Event setFinalDate( LocalDate finalDate ) {
        this.finalDate = finalDate;
        return this;
    }

    public Boolean getTwoChecks() {
        return isTwoChecks;
    }

    public Event setTwoChecks( Boolean twoChecks ) {
        isTwoChecks = twoChecks;
        return this;
    }

    public Integer getRadius() {
        return radius;
    }

    public Event setRadius( Integer radius ) {
        this.radius = radius;
        return this;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Event setLatitude( Double latitude ) {
        this.latitude = latitude;
        return this;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Event setLongitude( Double longitude ) {
        this.longitude = longitude;
        return this;
    }

//    public User getCreator() {
//        return creator;
//    }
//
//    public Event setCreator( User creator ) {
//        this.creator = creator;
//        return this;
//    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public Event setAdditionalInfo( String additionalInfo ) {
        this.additionalInfo = additionalInfo;
        return this;
    }
}

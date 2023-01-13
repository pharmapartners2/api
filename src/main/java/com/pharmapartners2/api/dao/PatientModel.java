package com.pharmapartners2.api.dao;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name="Patient")
public class PatientModel {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "bsn")
    private String bsn;
    @Column(name = "naam")
    private String naam;
    @Column(name = "telefoonnr")
    private String telefoonNr;
    @Column(name = "geboortedatum")
    private Date geboorteDatum;
    @Column(name = "adres")
    private String adres;
    @Column(name = "postcode")
    private String postcode;



    public PatientModel(){

    }

    public int getId() {
        return id;
    }

    public String getBsn() {
        return bsn;
    }

    public String getNaam() {
        return naam;
    }

    public String getTelefoonNr() {
        return telefoonNr;
    }

    public Date getGeboorteDatum() {
        return geboorteDatum;
    }

    public String adres () {
        return adres;
    }

    public String postcode () {
        return postcode;
    }

}

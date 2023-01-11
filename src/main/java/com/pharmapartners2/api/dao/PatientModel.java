package com.pharmapartners2.api.dao;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name="Patient")
public class PatientModel {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String bsn;
    @Column
    private String naam;
    @Column
    private String telefoonNr;
    @Column
    private Date geboorteDatum;
    @Column
    private String adres;
    @Column 
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

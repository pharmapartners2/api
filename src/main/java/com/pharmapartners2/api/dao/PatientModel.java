package com.pharmapartners2.api.dao;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="patient")
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

    public Date getGeboorteDatum() {
        return geboorteDatum;
    }

    public String getAdres() {
        return adres;
    }

    public String getTelefoonNr() {
        return telefoonNr;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setBsn(String bsn) {
        this.bsn = bsn;
    }

    public void setGeboorteDatum(Date geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setTelefoonNr(String telefoonNr) {
        this.telefoonNr = telefoonNr;
    }

    public void setId(int id) {
        this.id = id;
    }
}

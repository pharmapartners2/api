package com.pharmapartners2.api.dao;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Episode")
public class EpisodeModel {
    @Id
    @GeneratedValue
    int id;

    @Column(name="patientid")
    private int patientId;

    @Column
    private Date datum;

    @Column
    private String beschrijving;

    @Column
    private String icpccode;

    public EpisodeModel(){

    }

    public void setPatientId(int patientid) {
        this.patientId = patientid;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public void setIcpcCode(String icpcCode) {
        this.icpccode = icpcCode;
    }

    public int getPatientId() {
        return patientId;
    }

    public Date getDatum() {
        return datum;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public String getIcpcCode() {
        return icpccode;
    }


}
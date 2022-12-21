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

    @Column(name = "datum")
    private Date datum;

    @Column(name = "beschrijving")
    private String beschrijving;

    @Column(name = "icpccodeid")
    private int icpccodeid;

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

    public void setIcpccodeid(int icpccodeid) {
        this.icpccodeid = icpccodeid;
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

    public int getIcpccodeid() {
        return icpccodeid;
    }
}
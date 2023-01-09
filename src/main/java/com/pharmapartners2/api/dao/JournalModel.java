package com.pharmapartners2.api.dao;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name="journaal")
public class JournalModel {
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
    private int code;

    public void setPatientId(int patientid) {
        this.patientId = patientid;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
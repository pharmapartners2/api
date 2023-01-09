package com.pharmapartners2.api.dao;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name="intolerantie")
public class IntolerantieModel {
    @Id
    @GeneratedValue
    int id;

    @Column(name="patientid")
    private int patientId;

    @Column
    private String beschrijving;

    @Column
    private int code;

    public void setPatientId(int patientid) {
        this.patientId = patientid;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public int getPatientId() {
        return patientId;
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
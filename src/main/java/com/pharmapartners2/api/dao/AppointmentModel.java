package com.pharmapartners2.api.dao;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="afspraak")
public class AppointmentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "TBL_METADATA_ID_SEQ")
    private int id;

    @Column(name = "patientid")
    private int patientId;

    @Column(name = "datum")
    private Date datum;

    @Column(name = "beschrijving")
    private String beschrijving;

    @Column(name = "userid")
    private int userId;

    public int getId() {
        return id;
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

    public int getUserId() {
        return userId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

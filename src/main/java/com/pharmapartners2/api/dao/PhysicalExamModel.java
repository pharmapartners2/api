package com.pharmapartners2.api.dao;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="lichamelijkonderzoek")
public class PhysicalExamModel {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "patientid")
    private PatientModel patient;

    @Column(name = "datum")
    private Date datum;

    @Column(name = "waarde")
    private String waarde;

    @Column(name = "ddelementid")
    private int ddElementId;

    public PatientModel getPatient() {
        return patient;
    }

    public int getId() {
        return id;
    }

    public Date getDatum() {
        return datum;
    }

    public int getDdElementId() {
        return ddElementId;
    }

    public String getWaarde() {
        return waarde;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public void setDdElementId(int ddElementId) {
        this.ddElementId = ddElementId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPatient(PatientModel patient) {
        this.patient = patient;
    }

    public void setWaarde(String waarde) {
        this.waarde = waarde;
    }
}

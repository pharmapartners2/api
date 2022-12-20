package com.pharmapartners2.api.dao;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="medicatievoorschrift")
public class MedicationPrescriptionModel {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "patientid")
    private PatientModel patient;

    @Column(name = "datum")
    private Date datum;

    @Column(name = "beschrijving")
    private String beschrijving;

    @Column(name = "bpcode")
    private int bpCode;

    public int getId() {
        return id;
    }

    public int getBpCode() {
        return bpCode;
    }

    public PatientModel getPatient() {
        return patient;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public Date getDatum() {
        return datum;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPatient(PatientModel patient) {
        this.patient = patient;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public void setBpCode(int bpCode) {
        this.bpCode = bpCode;
    }
}

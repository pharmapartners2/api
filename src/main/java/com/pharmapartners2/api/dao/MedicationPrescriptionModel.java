package com.pharmapartners2.api.dao;

import jakarta.persistence.*;

@Entity
@Table(name="MedicatieVoorschrift")
public class MedicationPrescriptionModel {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "patientId")
    private PatientModel patient;

    @Column
    private String datum;

    @Column
    private String beschrijving;

    @Column
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

    public String getDatum() {
        return datum;
    }
}

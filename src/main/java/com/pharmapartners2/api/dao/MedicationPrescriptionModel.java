package com.pharmapartners2.api.dao;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="medicatievoorschrift")
public class MedicationPrescriptionModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "patientid")
    private int patientId;

    @Column(name = "datum")
    private Date datum;

    @Column(name = "beschrijving")
    private String beschrijving;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medicatieid")
    private Medication medication;

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setMedications(Medication medication) {
        this.medication = medication;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Date getDatum() {
        return datum;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public Medication getMedications() {
        return medication;
    }
}

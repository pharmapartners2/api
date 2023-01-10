package com.pharmapartners2.api.dao;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="afspraak")
public class AppointmentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "TBL_METADATA_ID_SEQ")
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patientid")
    private PatientModel patientModel;

    @Column(name = "datum")
    private Date datum;

    @Column(name = "beschrijving")
    private String beschrijving;

    @Column(name = "userid")
    private int userId;

    public int getId() {
        return id;
    }

    public PatientModel getPatientModel() {
        return patientModel;
    }

    public void setPatientModel(PatientModel patientModel) {
        this.patientModel = patientModel;
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

package com.pharmapartners2.api.dao;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="afspraak")
public class AppointmentModel {
    private String username;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "TBL_METADATA_ID_SEQ")
    private int id;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patientid")
    private PatientModel patientModel;

    @Column(name = "datum")
    private Date datum;

    @Column(name = "beschrijving")
    private String beschrijving;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

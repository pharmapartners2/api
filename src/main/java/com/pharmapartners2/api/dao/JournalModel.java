package com.pharmapartners2.api.dao;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name="journal")
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

    // @ManyToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "icpccodeid")
    // private IcpcCode icpcCode;

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

    // public IcpcCode getIcpcCode() {
    //     return icpcCode;
    // }

    // public void setIcpcCode(IcpcCode icpcCode) {
    //     this.icpcCode = icpcCode;
    // }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
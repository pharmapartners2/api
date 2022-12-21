package com.pharmapartners2.api.dao;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="lichamelijkonderzoek")
public class PhysicalExamModel {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "patientid")
    private int patientId;

    @Column(name = "datum")
    private Date datum;

    @Column(name = "waarde")
    private String waarde;

    @ManyToOne
    @JoinColumn(name = "ddelementid")
    private DDElement ddElement;
    public int getId() {
        return id;
    }

    public Date getDatum() {
        return datum;
    }

    public DDElement getDdElement() {
        return ddElement;
    }

    public void setDdElement(DDElement ddElement) {
        this.ddElement = ddElement;
    }

    public String getWaarde() {
        return waarde;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWaarde(String waarde) {
        this.waarde = waarde;
    }

}
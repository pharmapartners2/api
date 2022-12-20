package com.pharmapartners2.api.dao;

import jakarta.persistence.*;

@Entity
@Table(name="Patienten")
public class PatientModel {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String bsn;
    @Column
    private String naam;
    public PatientModel(){

    }

    public int getId() {
        return id;
    }

    public String getBsn() {
        return bsn;
    }

    public String getNaam() {
        return naam;
    }

}

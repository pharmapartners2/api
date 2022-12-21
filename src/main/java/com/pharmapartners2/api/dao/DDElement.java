package com.pharmapartners2.api.dao;

import jakarta.persistence.*;

@Entity
@Table(name = "ddelement")
public class DDElement {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "memocode")
    private String memocode;

    @Column(name = "aolsort")
    private int aolsort;

    @Column(name = "naam")
    private String naam;

    @Column(name = "eenheid")
    private String eenheid;

    public int getId() {
        return id;
    }

    public int getAolsort() {
        return aolsort;
    }

    public String getEenheid() {
        return eenheid;
    }

    public String getMemocode() {
        return memocode;
    }

    public String getNaam() {
        return naam;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAolsort(int aolsort) {
        this.aolsort = aolsort;
    }

    public void setEenheid(String eenheid) {
        this.eenheid = eenheid;
    }

    public void setMemocode(String memocode) {
        this.memocode = memocode;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}

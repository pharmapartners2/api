package com.pharmapartners2.api.dao;

import jakarta.persistence.*;

@Entity
@Table(name="medicatie")
public class Medication {
    @Id
    @GeneratedValue()
    private int id;

    @Column(name = "bp")
    private int bp;
    @Column(name = "bpnaam")
    private String bpNaam;

    @Column(name = "sterktehv")
    private int SterkteHv;
    @Column(name = "sterkteeh")
    private String SterkteEh;

    public String getBpNaam() {
        return bpNaam;
    }

    public int getId() {
        return id;
    }

    public int getSterkteHv() {
        return SterkteHv;
    }

    public String getSterkteEh() {
        return SterkteEh;
    }

    public void setSterkteHv(int sterkteHv) {
        SterkteHv = sterkteHv;
    }

    public void setSterkteEh(String sterkteEh) {
        SterkteEh = sterkteEh;
    }

    public void setBpNaam(String bpNaam) {
        this.bpNaam = bpNaam;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBp() {
        return bp;
    }

    public void setBp(int bp) {
        this.bp = bp;
    }
}

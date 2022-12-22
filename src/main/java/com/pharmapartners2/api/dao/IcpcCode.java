package com.pharmapartners2.api.dao;

import jakarta.persistence.*;

@Entity
@Table(name="icpccode")
public class IcpcCode {
    @Id
    @GeneratedValue
    int id;

    @Column(name = "icpicpccode")
    private String icpccode;

    @Column(name = "icpomschrijving")
    private String icpomschrijving;

    public int getId() {
        return id;
    }

    public String getIcpccode() {
        return icpccode;
    }

    public String getIcpomschrijving() {
        return icpomschrijving;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIcpccode(String icpccode) {
        this.icpccode = icpccode;
    }

    public void setIcpomschrijving(String icpomschrijving) {
        this.icpomschrijving = icpomschrijving;
    }
}

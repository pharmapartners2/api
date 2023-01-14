package com.pharmapartners2.api.dao;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name="journaalregel")
public class JournalRegel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "TBL_METADATA_ID_SEQ")
    int id;

    @Column(name="patientid")
    private int patientId;
    @Column(name = "code")
    private int code;
    @Column(name = "beschrijving")
    private String beschrijving;
    @Column(name = "datum")
    private Date datum;
    @Column(name = "episodeid")
    private int episodeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public int getEpisodeId() {
        return episodeId;
    }

    public void setEpisodeId(int episodeId) {
        this.episodeId = episodeId;
    }
}
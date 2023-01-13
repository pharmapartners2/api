package com.pharmapartners2.api.dao;

import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

@Entity
@Table(name="logging")
public class LoggingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "TBL_METADATA_ID_SEQ")
    int id;

    @Column(name="userid")
    private int userId;

    @Column(name="datetime")
    private String datetime;

    @Column(name="logline")
    private String logLine;

    public void setUserId(int userid) {
        this.userId = userid;
    }

    public void setDateTime(String datetime) {
        this.datetime = datetime;
    }

    public void setLogLine(String logline) {
        this.logLine = logline;
    }

    public int getUserId() {
        return userId;
    }

    public String getDateTime() {
        return datetime;
    }

    public String getLogLine() {
        return logLine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
package com.pharmapartners2.api.dao;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name="logging")
public class LoggingModel {
    @Id
    @GeneratedValue
    int id;

    @Column(name="userid")
    private int userId;

    @Column(name="datetime")
    private DateTime datetime;

    @Column(name="logline")
    private String logLine;

    public void setUserId(int userid) {
        this.userId = userid;
    }

    public void setDateTime(DateTime datetime) {
        this.datetime = datetime;
    }

    public void setLogLine(String logline) {
        this.logline = logline;
    }

    public int getUserId() {
        return userId;
    }

    public DateTime getDateTime() {
        return datetime;
    }

    public String getLogLine() {
        return logline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
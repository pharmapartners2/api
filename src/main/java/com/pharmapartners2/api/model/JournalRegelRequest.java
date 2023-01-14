package com.pharmapartners2.api.model;

import java.sql.Date;

public record JournalRegelRequest(int patientId, int code, String beschrijving, int episodeId, Date datum) {

}
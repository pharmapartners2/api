package com.pharmapartners2.api.model;

import java.sql.Date;

public record EpisodeRequest(String beschrijving, Date datum, int icpccode, int patientId) {

}
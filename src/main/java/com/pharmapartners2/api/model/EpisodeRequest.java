package com.pharmapartners2.api.model;

public record EpisodeRequest(int patientId, String datum, String beschrijving, int icpccode) {

}
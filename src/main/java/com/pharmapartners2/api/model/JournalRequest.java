package com.pharmapartners2.api.model;

public record JournalRequest(int patientId, String datum, String beschrijving, int code) {

}
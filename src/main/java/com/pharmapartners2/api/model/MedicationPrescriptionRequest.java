package com.pharmapartners2.api.model;

public record MedicationPrescriptionRequest(int patientId, String datum, String bescrijving, int bpCode) {
}

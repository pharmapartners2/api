package com.pharmapartners2.api.model;

import java.sql.Date;

public record MedicationPrescriptionRequest(int patientId, Date datum, String beschrijving, int bpCode) {

}

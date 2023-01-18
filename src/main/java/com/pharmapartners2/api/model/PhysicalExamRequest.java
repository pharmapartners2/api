package com.pharmapartners2.api.model;

public record PhysicalExamRequest(int patientId, String datum, int waarde, int ddElementId) {
}

package com.pharmapartners2.api.model;

import java.util.Date;

public record AppointmentRequest(int patientId, Date datum, String beschrijving, int userId, String username) {
}

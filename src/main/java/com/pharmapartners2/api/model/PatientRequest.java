package com.pharmapartners2.api.model;

import java.util.Date;

public record PatientRequest(String bsn, String naam, String telefoonNr, Date geboorteDatum, String adres, String postcode) {
}

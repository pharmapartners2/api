package com.pharmapartners2.api.model;

import java.util.Date;

public record LoggingRequest(int userId, String datetime, String logLine) {

}
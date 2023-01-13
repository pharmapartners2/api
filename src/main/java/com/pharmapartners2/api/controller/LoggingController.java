package com.pharmapartners2.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pharmapartners2.api.dao.LoggingModel;
import com.pharmapartners2.api.model.LoggingRequest;
import com.pharmapartners2.api.repository.LoggingRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class LoggingController {
    @Autowired
    private LoggingRepository loggingRepository;

    @GetMapping("/logging/{userId}")
    public @ResponseBody List<LoggingModel> getLoggingByUserId(@PathVariable int userId)
    {
        return loggingRepository.findLoggingByUserId(userId);
    }

    @PostMapping(value = "/logging", consumes = "application/json", produces = "application/json")
    public LoggingModel CreateLoggingMethod(@RequestBody LoggingRequest newLogging) {
        LoggingModel logging = new LoggingModel();
        logging.setDateTime(LocalDateTime.parse(newLogging.datetime()));
        logging.setLogLine(newLogging.logLine());
        logging.setUserId(newLogging.userId());
        return loggingRepository.save(logging);
    }
}
package com.pharmapartners2.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pharmapartners2.api.dao.LoggingModel;
import com.pharmapartners2.api.repository.LoggingRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
}
package com.pharmapartners2.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pharmapartners2.api.dao.IntolerantieModel;
import com.pharmapartners2.api.repository.IntolerantieRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@RestController
public class IntolerantieController {
    @Autowired
    private IntolerantieRepository intolerantieRepository;

    @GetMapping("/intolerantie/{patientId}")
    public @ResponseBody List<IntolerantieModel> getIntolerantieByPatientId(@PathVariable int patientId)
    {
        return intolerantieRepository.findIntolerantieByPatientId(patientId);
    }
}
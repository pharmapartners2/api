package com.pharmapartners2.api.controller;

import com.pharmapartners2.api.dao.PatientModel;
import com.pharmapartners2.api.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController{
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/Patient")
    public @ResponseBody List<PatientModel> getAllPatients()
    {
        return patientRepository.findAll();
    }
    @GetMapping("/Patient/{patientId}")
    public @ResponseBody PatientModel getPatientById(@PathVariable int patientId){return patientRepository.findById(patientId);}
}

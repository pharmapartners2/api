package com.pharmapartners2.api.controller;

import com.pharmapartners2.api.dao.*;
import com.pharmapartners2.api.repository.MedicationPrescriptionRepository;
import com.pharmapartners2.api.repository.PatientRepository;
import com.pharmapartners2.api.repository.PhysicalExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VisitingCardController {
    @Autowired
    private MedicationPrescriptionRepository medicationPrescriptionRepository;
    @Autowired
    private PhysicalExamRepository physicalExamRepository;
    @Autowired
    private PatientRepository patientRepository;
    @GetMapping("/VisitingCard")
    public VisitingCardModel getVisitingCard(){
        return null;
    }

    @GetMapping("/PhysicalExam")
    public @ResponseBody List<PhysicalExamModel> getAllPhysicalExams()
    {
        return physicalExamRepository.findAll();
    }
    @GetMapping("/Patient")
    public @ResponseBody List<PatientModel> getAllPatients()
    {
        return patientRepository.findAll();
    }
    @GetMapping("/Patient/{patientId}")
    public @ResponseBody PatientModel getPatientById(@PathVariable int patientId){return patientRepository.findById(patientId);}
}

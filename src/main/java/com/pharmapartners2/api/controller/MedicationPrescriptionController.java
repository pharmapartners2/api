package com.pharmapartners2.api.controller;

import com.pharmapartners2.api.dao.MedicationPrescriptionModel;
import com.pharmapartners2.api.repository.MedicationPrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicationPrescriptionController {
    @Autowired
    MedicationPrescriptionRepository medicationPrescriptionRepository;

    @GetMapping("/medicationprescription/{id}")
    public @ResponseBody List<MedicationPrescriptionModel> getMedicationPrescriptionByPatientId(@PathVariable int id){return medicationPrescriptionRepository.findByPatientId(id);}
}

package com.pharmapartners2.api.controller;

import com.pharmapartners2.api.dao.MedicationPrescriptionModel;
import com.pharmapartners2.api.model.MedicationPrescriptionRequest;
import com.pharmapartners2.api.repository.MedicationPrescriptionRepository;
import com.pharmapartners2.api.repository.MedicationRepository;
import com.pharmapartners2.api.dao.Medication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

@RestController
public class MedicationPrescriptionController {
    @Autowired
    MedicationPrescriptionRepository medicationPrescriptionRepository;

    @Autowired
    private MedicationRepository medicationRepository;

    @GetMapping("/medicationprescription/{id}")
    public @ResponseBody List<MedicationPrescriptionModel> getMedicationPrescriptionByPatientId(@PathVariable int id){return medicationPrescriptionRepository.findByPatientId(id);}

    @PostMapping(value = "/medicationprescription")
    public MedicationPrescriptionModel CreateEpisodeMethod(@RequestBody MedicationPrescriptionRequest newMedication) {
        MedicationPrescriptionModel medication = new MedicationPrescriptionModel();
        Medication medicatie = medicationRepository.findById(newMedication.bpCode());

        medication.setPatientId(newMedication.patientId());
        medication.setDatum(newMedication.datum());
        medication.setBeschrijving(newMedication.beschrijving());
        medication.setMedications(medicatie);
        return medicationPrescriptionRepository.save(medication);
    }
}

package com.pharmapartners2.api.repository;

import com.pharmapartners2.api.dao.MedicationPrescriptionModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicationPrescriptionRepository extends JpaRepository<MedicationPrescriptionModel, Integer> {
    List<MedicationPrescriptionModel> findByPatientId(int patientId);
}

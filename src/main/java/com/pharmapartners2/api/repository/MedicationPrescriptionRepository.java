package com.pharmapartners2.api.repository;

import com.pharmapartners2.api.dao.MedicationPrescriptionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicationPrescriptionRepository extends JpaRepository<MedicationPrescriptionModel, Integer> {
}

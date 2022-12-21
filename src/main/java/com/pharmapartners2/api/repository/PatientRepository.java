package com.pharmapartners2.api.repository;

import com.pharmapartners2.api.dao.PatientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientModel, Integer> {
    PatientModel findById(int patientId);
}

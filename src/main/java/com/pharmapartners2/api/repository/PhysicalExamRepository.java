package com.pharmapartners2.api.repository;

import com.pharmapartners2.api.dao.PhysicalExamModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhysicalExamRepository extends JpaRepository<PhysicalExamModel, Integer> {
    List<PhysicalExamModel> findByPatientId(int patientId);
}

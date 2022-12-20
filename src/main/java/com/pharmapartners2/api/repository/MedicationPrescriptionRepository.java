package com.pharmapartners2.api.repository;

import com.pharmapartners2.api.dao.MedicationPrescriptionModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MedicationPrescriptionRepository extends CrudRepository<MedicationPrescriptionModel, Integer> {
    List<MedicationPrescriptionModel> findByPatientId(int id);

}

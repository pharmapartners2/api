package com.pharmapartners2.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pharmapartners2.api.dao.Medication;

@Repository
public interface MedicationRepository extends CrudRepository<Medication, Integer> {
    Medication findById(int id);
}

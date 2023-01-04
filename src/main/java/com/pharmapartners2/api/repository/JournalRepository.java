package com.pharmapartners2.api.repository;

import org.springframework.stereotype.Repository;
import com.pharmapartners2.api.dao.JournalModel;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

@Repository
public interface JournalRepository extends CrudRepository<JournalModel, Integer>{
    List<JournalModel> findJournalByPatientId(int patientId);
}
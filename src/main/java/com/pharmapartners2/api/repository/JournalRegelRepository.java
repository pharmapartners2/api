package com.pharmapartners2.api.repository;

import org.springframework.stereotype.Repository;
import com.pharmapartners2.api.dao.JournalRegel;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

@Repository
public interface JournalRegelRepository extends CrudRepository<JournalRegel, Integer>{
    List<JournalRegel> findJournalByPatientId(int patientId);
}
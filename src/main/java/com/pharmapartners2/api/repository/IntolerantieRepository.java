package com.pharmapartners2.api.repository;

import org.springframework.stereotype.Repository;
import com.pharmapartners2.api.dao.IntolerantieModel;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

@Repository
public interface IntolerantieRepository extends CrudRepository<IntolerantieModel, Integer>{
    List<IntolerantieModel> findIntolerantieByPatientId(int patientId);
}
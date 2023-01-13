package com.pharmapartners2.api.repository;

import org.springframework.stereotype.Repository;
import com.pharmapartners2.api.dao.LoggingModel;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

@Repository
public interface LoggingRepository extends CrudRepository<LoggingModel, Integer>{
    List<LoggingModel> findLoggingByUserId(int userId);
}
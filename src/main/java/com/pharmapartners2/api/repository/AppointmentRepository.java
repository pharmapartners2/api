package com.pharmapartners2.api.repository;

import com.pharmapartners2.api.dao.AppointmentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<AppointmentModel, Integer> {
    AppointmentModel findById(int patientId);
    @Query(value = "select * from Afspraak where datum = CAST(CURRENT_TIMESTAMP AS DATE)", nativeQuery = true)
    List<AppointmentModel> findByDatum(Date datum);
}

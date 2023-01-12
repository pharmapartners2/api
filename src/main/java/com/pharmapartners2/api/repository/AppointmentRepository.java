package com.pharmapartners2.api.repository;

import com.pharmapartners2.api.dao.AppointmentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<AppointmentModel, Integer> {
    //AppointmentModel findById(int userId);
    List<AppointmentModel> findByUserId(int userId);

    //@Query(value = "SELECT u.id, u.username, a.beschrijving, a.datum, a.id, a.patientid FROM users u RIGHT JOIN afspraak a ON u.id=a.userid", nativeQuery = true)
    @Query(value = "SELECT a.beschrijving, a.id, a.patientid, a.datum, a.userid, u.username FROM afspraak a LEFT JOIN users u ON u.id=a.userid", nativeQuery = true)
    List<AppointmentModel> findAllAppointments();
}

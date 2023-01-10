package com.pharmapartners2.api.repository;

import com.pharmapartners2.api.dao.AppointmentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<AppointmentModel, Integer> {
    AppointmentModel findById(int appointmentId);
}

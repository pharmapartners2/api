package com.pharmapartners2.api.repository;

import com.pharmapartners2.api.dao.PhysicalExamModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhysicalExamRepository extends JpaRepository<PhysicalExamModel, Integer> {
}

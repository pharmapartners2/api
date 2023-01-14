package com.pharmapartners2.api.repository;

import com.pharmapartners2.api.dao.DDElement;
import org.springframework.data.repository.CrudRepository;

public interface DDElementRepository extends CrudRepository<DDElement, Integer> {
    DDElement findDDElementById(int ddelementid);

}

package com.pharmapartners2.api.repository;

import org.springframework.stereotype.Repository;
import com.pharmapartners2.api.dao.IcpcCode;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface IcpcCodeRepository extends CrudRepository<IcpcCode, Integer> {
    IcpcCode findById(int id);
    List<IcpcCode> findAll();
}
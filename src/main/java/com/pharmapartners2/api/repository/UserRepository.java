package com.pharmapartners2.api.repository;

import com.pharmapartners2.api.dao.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Integer> {
    UserModel findUserById(int id);
    List<UserModel> findAll();
    UserModel findUserByUsername(String username);
}

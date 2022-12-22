package com.pharmapartners2.api.repository;

import org.springframework.stereotype.Repository;
import com.pharmapartners2.api.dao.EpisodeModel;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

@Repository
public interface EpisodeRepository extends CrudRepository<EpisodeModel, Integer>{
    List<EpisodeModel> findEpisodeByPatientId(int patientId);
}
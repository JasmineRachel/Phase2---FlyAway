package com.phase2.FlyAway.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.phase2.FlyAway.model.Airline;

@Repository
public interface AirlineRepo extends CrudRepository<Airline, Integer> {

}

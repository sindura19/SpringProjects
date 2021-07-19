package com.nt.repo;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.CoronaVaccine;

public interface ICorronaVaccineRepo extends CrudRepository<CoronaVaccine, Long> {

}

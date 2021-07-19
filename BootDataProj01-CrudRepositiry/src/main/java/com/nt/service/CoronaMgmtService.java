package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.CoronaVaccine;
import com.nt.repo.ICorronaVaccineRepo;

@Service("vaccineMgmtService")
public class CoronaMgmtService implements ICoronaMgmtService {

	@Autowired
	private ICorronaVaccineRepo repo;
	@Override
	public String registerVaccine(CoronaVaccine vaccine) {
		CoronaVaccine savedVaccine=repo.save(vaccine);
		return savedVaccine!=null?"Vaccine Registered Successfully"+savedVaccine.getRegNo():"Not registed";
	}

}

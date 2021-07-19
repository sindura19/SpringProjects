package com.nt.service;

import com.nt.entity.CoronaVaccine;
import com.nt.repo.ICorronaVaccineRepo;

public interface ICoronaMgmtService {
	public String registerVaccine(CoronaVaccine vaccine);
}

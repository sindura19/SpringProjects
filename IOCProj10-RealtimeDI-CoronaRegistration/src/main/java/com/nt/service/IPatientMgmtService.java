package com.nt.service;

import com.nt.dto.PatientDTO;

public interface IPatientMgmtService {
	public String calculateTotalBill(PatientDTO dto) throws Exception;
}

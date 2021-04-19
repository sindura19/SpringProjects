package com.nt.service;

import com.nt.bo.PatientBO;
import com.nt.dao.IPatientDAO;
import com.nt.dto.PatientDTO;

public class PatientMgmtService implements IPatientMgmtService {
	private IPatientDAO dao;
	
	public PatientMgmtService(IPatientDAO dao) {
		System.out.println("PatientMgmtService:: 1 param constructor");
		this.dao = dao;
	}

	@Override
	public String calculateTotalBill(PatientDTO dto) throws Exception {
		float totalBillAmount=dto.getNoOfDaysAdmittedToHospital()*dto.getBillPerDay();
		float netBillAmount=totalBillAmount - totalBillAmount*dto.getDiscount()/100.0f;
		
		PatientBO bo=new PatientBO();
		bo.setPatientName(dto.getPatientName());
		bo.setPatientAddress(dto.getPatientAddress());
		bo.setPatientMobileNumber(dto.getPatientMobileNumber());
		bo.setNoOfDaysAdmittedToHospital(dto.getNoOfDaysAdmittedToHospital());
		bo.setBillPerDay(dto.getBillPerDay());
		bo.setDiscount(dto.getDiscount());
		bo.setTotalBillAmount(totalBillAmount);
		bo.setNetBillAmount(netBillAmount);
		
		int count=dao.insert(bo);
		return count==1 ? "Corona Patient Registered and Bill amount after discount: "+netBillAmount:"Registration failed";
		
	}

}

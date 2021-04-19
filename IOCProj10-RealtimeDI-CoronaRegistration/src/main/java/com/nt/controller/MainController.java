package com.nt.controller;

import com.nt.dto.PatientDTO;
import com.nt.service.IPatientMgmtService;
import com.nt.vo.PatientVO;

public class MainController {
	private IPatientMgmtService service;

	public MainController(IPatientMgmtService service) {
		System.out.println("MainController:: 1 param constructor");
		this.service = service;
	}
	
	public String registerPatient(PatientVO vo)throws Exception {
		
		PatientDTO dto=new PatientDTO();
		dto.setPatientName(vo.getPatientName());
		dto.setPatientAddress(vo.getPatientAddress());
		dto.setPatientMobileNumber(Long.parseLong(vo.getPatientMobileNumber()));
		dto.setNoOfDaysAdmittedToHospital(Integer.parseInt(vo.getNoOfDaysAdmittedToHospital()));
		dto.setBillPerDay(Float.parseFloat(vo.getBillPerDay()));
		dto.setDiscount(Float.parseFloat(vo.getDiscount()));
		String result=service.calculateTotalBill(dto);
		return result;
	}
	
}

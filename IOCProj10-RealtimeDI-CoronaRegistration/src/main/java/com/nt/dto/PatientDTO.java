package com.nt.dto;

public class PatientDTO {
	private String patientName;
	private String patientAddress;
	private Long patientMobileNumber;
	private Integer noOfDaysAdmittedToHospital;
	private Float billPerDay;
	private Float discount;
	
	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public Long getPatientMobileNumber() {
		return patientMobileNumber;
	}

	public void setPatientMobileNumber(Long patientMobileNumber) {
		this.patientMobileNumber = patientMobileNumber;
	}

	public Integer getNoOfDaysAdmittedToHospital() {
		return noOfDaysAdmittedToHospital;
	}

	public void setNoOfDaysAdmittedToHospital(Integer noOfDaysAdmittedToHospital) {
		this.noOfDaysAdmittedToHospital = noOfDaysAdmittedToHospital;
	}

	public Float getBillPerDay() {
		return billPerDay;
	}

	public void setBillPerDay(Float billPerDay) {
		this.billPerDay = billPerDay;
	}

	@Override
	public String toString() {
		return "PatientDTO [patientName=" + patientName + ", patientAddress=" + patientAddress
				+ ", patientMobileNumber=" + patientMobileNumber + ", noOfDaysAdmittedToHospital="
				+ noOfDaysAdmittedToHospital + ", billPerDay=" + billPerDay + ", discount=" + discount + "]";
	}
	
	
}

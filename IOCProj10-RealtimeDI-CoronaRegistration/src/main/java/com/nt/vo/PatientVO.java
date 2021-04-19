package com.nt.vo;

public class PatientVO {
	private String patientName;
	private String patientAddress;
	private String patientMobileNumber;
	private String noOfDaysAdmittedToHospital;
	private String billPerDay;
	private String discount;
	
	
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
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
	public String getPatientMobileNumber() {
		return patientMobileNumber;
	}
	public void setPatientMobileNumber(String patientMobileNumber) {
		this.patientMobileNumber = patientMobileNumber;
	}
	public String getNoOfDaysAdmittedToHospital() {
		return noOfDaysAdmittedToHospital;
	}
	public void setNoOfDaysAdmittedToHospital(String noOfDaysAdmittedToHospital) {
		this.noOfDaysAdmittedToHospital = noOfDaysAdmittedToHospital;
	}
	public String getBillPerDay() {
		return billPerDay;
	}
	public void setBillPerDay(String billPerDay) {
		this.billPerDay = billPerDay;
	}
	@Override
	public String toString() {
		return "PatientVO [patientName=" + patientName + ", patientAddress=" + patientAddress + ", patientMobileNumber="
				+ patientMobileNumber + ", noOfDaysAdmittedToHospital=" + noOfDaysAdmittedToHospital + ", billPerDay="
				+ billPerDay + ", discount=" + discount + "]";
	}
	
	
}

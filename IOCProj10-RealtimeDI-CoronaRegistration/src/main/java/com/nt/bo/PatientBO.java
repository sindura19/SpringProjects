package com.nt.bo;

public class PatientBO {
	private String patientName;
	private String patientAddress;
	private Long patientMobileNumber;
	private Integer noOfDaysAdmittedToHospital;
	private Float billPerDay;
	private Float discount;
	private Float totalBillAmount;
	private Float netBillAmount;
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
	public Float getDiscount() {
		return discount;
	}
	public void setDiscount(Float discount) {
		this.discount = discount;
	}
	public Float getTotalBillAmount() {
		return totalBillAmount;
	}
	public void setTotalBillAmount(Float totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}
	public Float getNetBillAmount() {
		return netBillAmount;
	}
	public void setNetBillAmount(Float netBillAmount) {
		this.netBillAmount = netBillAmount;
	}
	@Override
	public String toString() {
		return "PatientBO [patientName=" + patientName + ", patientAddress=" + patientAddress + ", patientMobileNumber="
				+ patientMobileNumber + ", noOfDaysAdmittedToHospital=" + noOfDaysAdmittedToHospital + ", billPerDay="
				+ billPerDay + ", discount=" + discount + ", totalBillAmount=" + totalBillAmount + ", netBillAmount="
				+ netBillAmount + "]";
	}
	
}

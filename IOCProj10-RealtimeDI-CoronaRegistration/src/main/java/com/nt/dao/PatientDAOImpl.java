package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.PatientBO;

public class PatientDAOImpl implements IPatientDAO {
	private static final String REALTIMEDI_PATIENT_INSERT_QUERY="insert into REALTIMEDI_PATIENT values(?,?,?,?,?,?,?,?)";
	private DataSource ds;
	
	public PatientDAOImpl(DataSource ds) {
		System.out.println("PatientDAOImpl:: 1 param constructor");
		this.ds = ds;
	}

	@Override
	public int insert(PatientBO bo) {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		try {
			con=ds.getConnection();
			ps=con.prepareStatement(REALTIMEDI_PATIENT_INSERT_QUERY);
			ps.setString(1, bo.getPatientName());
			ps.setString(2, bo.getPatientAddress());
			ps.setLong(3, bo.getPatientMobileNumber());
			ps.setInt(4, bo.getNoOfDaysAdmittedToHospital());
			ps.setFloat(5, bo.getBillPerDay());
			ps.setFloat(6, bo.getDiscount());
			ps.setFloat(7, bo.getNetBillAmount());
			ps.setFloat(8, bo.getTotalBillAmount());
			
			count=ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return count;
	}

}

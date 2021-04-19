package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.PatientVO;

public class CoronaPatientRegistrationTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Patient Name");
		String patientName=sc.nextLine();
		
		System.out.println("Enter Patient Address");
		String patientAddress=sc.nextLine();
		
		System.out.println("Enter Patient Mobile Number");
		String mobileno=sc.next();
		
		System.out.println("Enter No of days Patient Hospitalised");
		String noOfDaysHospitalized=sc.next();
		
		System.out.println("Enter BillAmount per Day");
		String billPerDay=sc.next();
		
		System.out.println("Enter discount offered");
		String discount=sc.next();
		
		PatientVO vo=new PatientVO();
		vo.setPatientName(patientName);
		vo.setPatientAddress(patientAddress);
		vo.setPatientMobileNumber(mobileno);
		vo.setNoOfDaysAdmittedToHospital(noOfDaysHospitalized);
		vo.setBillPerDay(billPerDay);
		vo.setDiscount(discount);
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		MainController controller=factory.getBean("controller",MainController.class);
		try {
			String result=controller.registerPatient(vo);
			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

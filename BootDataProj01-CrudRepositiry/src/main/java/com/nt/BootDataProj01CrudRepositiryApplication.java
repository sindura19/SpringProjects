package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.entity.CoronaVaccine;
import com.nt.service.CoronaMgmtService;
import com.nt.service.ICoronaMgmtService;

@SpringBootApplication
public class BootDataProj01CrudRepositiryApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootDataProj01CrudRepositiryApplication.class, args);
		ICoronaMgmtService service=context.getBean("vaccineMgmtService",CoronaMgmtService.class );
		try {
			CoronaVaccine vaccine =new CoronaVaccine(null,"Covaxin","Bharat BioTech","India",780.0,2);
			service.registerVaccine(vaccine);
		}catch (DataAccessException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) context).close();
	}

}

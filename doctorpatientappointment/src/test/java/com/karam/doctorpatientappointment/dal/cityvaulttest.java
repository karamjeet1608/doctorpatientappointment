package com.karam.doctorpatientappointment.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.karam.doctorpatientappointment.dal.entities.City_Vault;
import com.karam.doctorpatientappointment.dal.respository.CityVaultRepository;


@RunWith(SpringRunner.class)
@SpringBootTest

public class cityvaulttest {

	
	@Autowired
	private CityVaultRepository CityVaultRespository;
	
	@Test
	
	public void testaddcityvault()
	
	{
		
		City_Vault cityvault =new City_Vault();
		cityvault.setCitydescription("heidelberg");
		cityvault.setCityid(1);
		cityvault.setCityname("heidelberg");
		
		CityVaultRespository.save(cityvault);
	}
}

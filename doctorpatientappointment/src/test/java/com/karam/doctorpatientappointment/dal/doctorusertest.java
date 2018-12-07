package com.karam.doctorpatientappointment.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.karam.doctorpatientappointment.dal.entities.Doctor_User;
import com.karam.doctorpatientappointment.dal.respository.DoctorUserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class doctorusertest {
	
@Autowired	
private DoctorUserRepository DoctorUserRepository;
@Test
public void testadddoctoruser()

{
	
	Doctor_User doctoruser =new Doctor_User();
	doctoruser.setDoctorfirstname("Tushar");
	doctoruser.setDoctorgender("Tushartester");
	doctoruser.setDoctorareaaddress("asdtester");
	doctoruser.setDoctoremail("Tushar@123.com");
	doctoruser.setDoctorcontact(21213);
	doctoruser.setDoctorexperience("3years");
	doctoruser.setDoctorlastname("Tusharsigh");
	doctoruser.setDoctoroverallrating(2);
	doctoruser.setDoctorpassword("check");
	doctoruser.setDoctorpostalcode(112);
	doctoruser.setDoctorstreetaddress("testermapped");
	doctoruser.setDoctorfees(12);
	
	DoctorUserRepository.save(doctoruser);
}


}

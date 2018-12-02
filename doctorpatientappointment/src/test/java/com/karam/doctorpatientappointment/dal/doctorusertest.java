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
	doctoruser.setDoctorfirstname("tester");
	doctoruser.setDoctorgender("tester");
	doctoruser.setDoctorareaaddress("tester");
	doctoruser.setDoctoremail("sunny@123.com");
	doctoruser.setDoctorcontact(213);
	doctoruser.setDoctorexperience("tester");
	doctoruser.setDoctorlastname("tester");
	doctoruser.setDoctoroverallrating(11);
	doctoruser.setDoctorpassword("tester");
	doctoruser.setDoctorpostalcode(12);
	doctoruser.setDoctorstreetaddress("tester");
	doctoruser.setDoctorfees(112);
	
	DoctorUserRepository.save(doctoruser);
}


}

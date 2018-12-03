package com.karam.doctorpatientappointment.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.karam.doctorpatientappointment.dal.entities.Patient_User;
import com.karam.doctorpatientappointment.dal.respository.PatientUserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class patientusertest {

	@Autowired
	private PatientUserRepository PatientUserRepository;

	@Test
	public void testaddpatientuser()

	{

		Patient_User patientuser = new Patient_User();
		patientuser.setPatientfirstname("Sunny");
		patientuser.setPatientlastname("Banawalikar");
		patientuser.setPatientgender("Male");
		patientuser.setPatientcontact(9821);
		patientuser.setPatientcity("Heidelberg");
		patientuser.setPatientareaaddress("Maria-Probst");
		patientuser.setPatientemail("Sunny@123.com");
		patientuser.setPatientpassword("xyz123");
		patientuser.setPatientpostalcode(1453);
		patientuser.setPatientstreetaddress("Bohefferstrasse");

		PatientUserRepository.save(patientuser);

	}

}

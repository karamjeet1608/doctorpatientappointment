package com.karam.doctorpatientappointment.dal.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karam.doctorpatientappointment.dal.entities.Patient_User;

public interface PatientUserRepository extends JpaRepository<Patient_User, Integer> {

	  
	Patient_User getBypatientemail(String patientemail);

}

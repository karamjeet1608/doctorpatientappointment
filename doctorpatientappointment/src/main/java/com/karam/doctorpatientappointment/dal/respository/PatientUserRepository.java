package com.karam.doctorpatientappointment.dal.respository;

import org.springframework.data.repository.CrudRepository;

import com.karam.doctorpatientappointment.dal.entities.Patient_User;

public interface PatientUserRepository extends CrudRepository<Patient_User, Integer> {

}

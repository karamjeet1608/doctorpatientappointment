package com.karam.doctorpatientappointment.dal.respository;

import org.springframework.data.repository.CrudRepository;

import com.karam.doctorpatientappointment.dal.entities.Doctor_User;

public interface DoctorUserRepository extends CrudRepository<Doctor_User, Integer> {

	Doctor_User getBydoctoremail(String doctoremail);

}

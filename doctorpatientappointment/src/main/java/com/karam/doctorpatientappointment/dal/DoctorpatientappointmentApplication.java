package com.karam.doctorpatientappointment.dal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.karam.doctorpatientappointment.controllers.patientUserController;


@SpringBootApplication
@ComponentScan(basePackageClasses=patientUserController.class)
public class DoctorpatientappointmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorpatientappointmentApplication.class, args);
	}
}

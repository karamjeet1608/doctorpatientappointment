package com.karam.doctorpatientappointment.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.karam.doctorpatientappointment.dal.entities.Appointment_Availability;


@RunWith(SpringRunner.class)
@SpringBootTest

public class appointmentavailablitytest {
	
	
	@Autowired
	private  com.karam.doctorpatientappointment.dal.respository.Appointment_Availability_respository Appointment_Availability_respository;
	
	@Test
	public void testaddappointmentavailability() {
		
		Appointment_Availability appointmentavailability = new Appointment_Availability();
		
		
		appointmentavailability.setAppointmentavailabilitydoctor(1);
		appointmentavailability.setAppointmentavailabilityslotday("test");
		appointmentavailability.setAppointmentavailabilityslottime1(1);
		appointmentavailability.setAppointmentavailabilityslottime10(1);
		appointmentavailability.setAppointmentavailabilityslottime11(11);
		appointmentavailability.setAppointmentavailabilityslottime12(14);
		appointmentavailability.setAppointmentavailabilityslottime2(20);
		appointmentavailability.setAppointmentavailabilityslottime3(15);
		appointmentavailability.setAppointmentavailabilityslottime4(16);
		appointmentavailability.setAppointmentavailabilityslottime5(17);
		appointmentavailability.setAppointmentavailabilityslottime7(11);
		appointmentavailability.setAppointmentavailabilityslottime6(9);
		appointmentavailability.setAppointmentavailabilityslottime8(7);
		appointmentavailability.setAppointmentavailabilityslottime9(8);
		
		Appointment_Availability_respository.save(appointmentavailability);
		
	}

}

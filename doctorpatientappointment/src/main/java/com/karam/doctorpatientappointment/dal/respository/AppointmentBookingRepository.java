package com.karam.doctorpatientappointment.dal.respository;

import org.springframework.data.repository.CrudRepository;

import com.karam.doctorpatientappointment.dal.entities.Appointment_Booking;

public interface AppointmentBookingRepository extends CrudRepository<Appointment_Booking, Integer> {

}

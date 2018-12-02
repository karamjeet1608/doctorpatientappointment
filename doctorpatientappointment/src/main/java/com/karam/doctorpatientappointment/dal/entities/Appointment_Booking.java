package com.karam.doctorpatientappointment.dal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointmentbooking")
public class Appointment_Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer appointmentbookingid;
	private String appointmentbookingslotdate;
	private String appointmentbookingslotdau;
	private Integer appointmentbookingdoctor;
	private Integer appointmentbookingpatient;
	private String appointmentbookingtreatment;
	private String appointmentbookingprescription;
	private String appointmentbookingfeedback;
	private String appointmentbookingstatus;
	public Integer getAppointmentbookingid() {
		return appointmentbookingid;
	}
	public void setAppointmentbookingid(Integer appointmentbookingid) {
		this.appointmentbookingid = appointmentbookingid;
	}
	public String getAppointmentbookingslotdate() {
		return appointmentbookingslotdate;
	}
	public void setAppointmentbookingslotdate(String appointmentbookingslotdate) {
		this.appointmentbookingslotdate = appointmentbookingslotdate;
	}
	public String getAppointmentbookingslotdau() {
		return appointmentbookingslotdau;
	}
	public void setAppointmentbookingslotdau(String appointmentbookingslotdau) {
		this.appointmentbookingslotdau = appointmentbookingslotdau;
	}
	public Integer getAppointmentbookingdoctor() {
		return appointmentbookingdoctor;
	}
	public void setAppointmentbookingdoctor(Integer appointmentbookingdoctor) {
		this.appointmentbookingdoctor = appointmentbookingdoctor;
	}
	public Integer getAppointmentbookingpatient() {
		return appointmentbookingpatient;
	}
	public void setAppointmentbookingpatient(Integer appointmentbookingpatient) {
		this.appointmentbookingpatient = appointmentbookingpatient;
	}
	public String getAppointmentbookingtreatment() {
		return appointmentbookingtreatment;
	}
	public void setAppointmentbookingtreatment(String appointmentbookingtreatment) {
		this.appointmentbookingtreatment = appointmentbookingtreatment;
	}
	public String getAppointmentbookingprescription() {
		return appointmentbookingprescription;
	}
	public void setAppointmentbookingprescription(String appointmentbookingprescription) {
		this.appointmentbookingprescription = appointmentbookingprescription;
	}
	public String getAppointmentbookingfeedback() {
		return appointmentbookingfeedback;
	}
	public void setAppointmentbookingfeedback(String appointmentbookingfeedback) {
		this.appointmentbookingfeedback = appointmentbookingfeedback;
	}
	public String getAppointmentbookingstatus() {
		return appointmentbookingstatus;
	}
	public void setAppointmentbookingstatus(String appointmentbookingstatus) {
		this.appointmentbookingstatus = appointmentbookingstatus;
	}
	@Override
	public String toString() {
		return "Appointment_Booking [appointmentbookingid=" + appointmentbookingid + ", appointmentbookingslotdate="
				+ appointmentbookingslotdate + ", appointmentbookingslotdau=" + appointmentbookingslotdau
				+ ", appointmentbookingdoctor=" + appointmentbookingdoctor + ", appointmentbookingpatient="
				+ appointmentbookingpatient + ", appointmentbookingtreatment=" + appointmentbookingtreatment
				+ ", appointmentbookingprescription=" + appointmentbookingprescription + ", appointmentbookingfeedback="
				+ appointmentbookingfeedback + ", appointmentbookingstatus=" + appointmentbookingstatus + "]";
	}

	
}

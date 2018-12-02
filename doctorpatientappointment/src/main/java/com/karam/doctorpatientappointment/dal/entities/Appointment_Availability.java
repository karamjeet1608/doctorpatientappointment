package com.karam.doctorpatientappointment.dal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appointmentavailability")

public class Appointment_Availability {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer appointmentavailabilityid;
	private Integer appointmentavailabilitydoctor;
	private String appointmentavailabilityslotday;
	private Integer appointmentavailabilityslottime1;
	private Integer appointmentavailabilityslottime2;
	private Integer appointmentavailabilityslottime3;
	private Integer appointmentavailabilityslottime4;
	private Integer appointmentavailabilityslottime5;
	private Integer appointmentavailabilityslottime6;
	private Integer appointmentavailabilityslottime7;
	private Integer appointmentavailabilityslottime8;
	private Integer appointmentavailabilityslottime9;
	private Integer appointmentavailabilityslottime10;
	private Integer appointmentavailabilityslottime11;
	private Integer appointmentavailabilityslottime12;
	public Integer getAppointmentavailabilityid() {
		return appointmentavailabilityid;
	}
	public void setAppointmentavailabilityid(Integer appointmentavailabilityid) {
		this.appointmentavailabilityid = appointmentavailabilityid;
	}
	public Integer getAppointmentavailabilitydoctor() {
		return appointmentavailabilitydoctor;
	}
	public void setAppointmentavailabilitydoctor(Integer appointmentavailabilitydoctor) {
		this.appointmentavailabilitydoctor = appointmentavailabilitydoctor;
	}
	public String getAppointmentavailabilityslotday() {
		return appointmentavailabilityslotday;
	}
	public void setAppointmentavailabilityslotday(String appointmentavailabilityslotday) {
		this.appointmentavailabilityslotday = appointmentavailabilityslotday;
	}
	public Integer getAppointmentavailabilityslottime1() {
		return appointmentavailabilityslottime1;
	}
	public void setAppointmentavailabilityslottime1(Integer appointmentavailabilityslottime1) {
		this.appointmentavailabilityslottime1 = appointmentavailabilityslottime1;
	}
	public Integer getAppointmentavailabilityslottime2() {
		return appointmentavailabilityslottime2;
	}
	public void setAppointmentavailabilityslottime2(Integer appointmentavailabilityslottime2) {
		this.appointmentavailabilityslottime2 = appointmentavailabilityslottime2;
	}
	public Integer getAppointmentavailabilityslottime3() {
		return appointmentavailabilityslottime3;
	}
	public void setAppointmentavailabilityslottime3(Integer appointmentavailabilityslottime3) {
		this.appointmentavailabilityslottime3 = appointmentavailabilityslottime3;
	}
	public Integer getAppointmentavailabilityslottime4() {
		return appointmentavailabilityslottime4;
	}
	public void setAppointmentavailabilityslottime4(Integer appointmentavailabilityslottime4) {
		this.appointmentavailabilityslottime4 = appointmentavailabilityslottime4;
	}
	public Integer getAppointmentavailabilityslottime5() {
		return appointmentavailabilityslottime5;
	}
	public void setAppointmentavailabilityslottime5(Integer appointmentavailabilityslottime5) {
		this.appointmentavailabilityslottime5 = appointmentavailabilityslottime5;
	}
	public Integer getAppointmentavailabilityslottime6() {
		return appointmentavailabilityslottime6;
	}
	public void setAppointmentavailabilityslottime6(Integer appointmentavailabilityslottime6) {
		this.appointmentavailabilityslottime6 = appointmentavailabilityslottime6;
	}
	public Integer getAppointmentavailabilityslottime7() {
		return appointmentavailabilityslottime7;
	}
	public void setAppointmentavailabilityslottime7(Integer appointmentavailabilityslottime7) {
		this.appointmentavailabilityslottime7 = appointmentavailabilityslottime7;
	}
	public Integer getAppointmentavailabilityslottime8() {
		return appointmentavailabilityslottime8;
	}
	public void setAppointmentavailabilityslottime8(Integer appointmentavailabilityslottime8) {
		this.appointmentavailabilityslottime8 = appointmentavailabilityslottime8;
	}
	public Integer getAppointmentavailabilityslottime9() {
		return appointmentavailabilityslottime9;
	}
	public void setAppointmentavailabilityslottime9(Integer appointmentavailabilityslottime9) {
		this.appointmentavailabilityslottime9 = appointmentavailabilityslottime9;
	}
	public Integer getAppointmentavailabilityslottime10() {
		return appointmentavailabilityslottime10;
	}
	public void setAppointmentavailabilityslottime10(Integer appointmentavailabilityslottime10) {
		this.appointmentavailabilityslottime10 = appointmentavailabilityslottime10;
	}
	public Integer getAppointmentavailabilityslottime11() {
		return appointmentavailabilityslottime11;
	}
	public void setAppointmentavailabilityslottime11(Integer appointmentavailabilityslottime11) {
		this.appointmentavailabilityslottime11 = appointmentavailabilityslottime11;
	}
	public Integer getAppointmentavailabilityslottime12() {
		return appointmentavailabilityslottime12;
	}
	public void setAppointmentavailabilityslottime12(Integer appointmentavailabilityslottime12) {
		this.appointmentavailabilityslottime12 = appointmentavailabilityslottime12;
	}
	@Override
	public String toString() {
		return "Appointment_Availability [appointmentavailabilityid=" + appointmentavailabilityid
				+ ", appointmentavailabilitydoctor=" + appointmentavailabilitydoctor
				+ ", appointmentavailabilityslotday=" + appointmentavailabilityslotday
				+ ", appointmentavailabilityslottime1=" + appointmentavailabilityslottime1
				+ ", appointmentavailabilityslottime2=" + appointmentavailabilityslottime2
				+ ", appointmentavailabilityslottime3=" + appointmentavailabilityslottime3
				+ ", appointmentavailabilityslottime4=" + appointmentavailabilityslottime4
				+ ", appointmentavailabilityslottime5=" + appointmentavailabilityslottime5
				+ ", appointmentavailabilityslottime6=" + appointmentavailabilityslottime6
				+ ", appointmentavailabilityslottime7=" + appointmentavailabilityslottime7
				+ ", appointmentavailabilityslottime8=" + appointmentavailabilityslottime8
				+ ", appointmentavailabilityslottime9=" + appointmentavailabilityslottime9
				+ ", appointmentavailabilityslottime10=" + appointmentavailabilityslottime10
				+ ", appointmentavailabilityslottime11=" + appointmentavailabilityslottime11
				+ ", appointmentavailabilityslottime12=" + appointmentavailabilityslottime12 + "]";
	}

	
}
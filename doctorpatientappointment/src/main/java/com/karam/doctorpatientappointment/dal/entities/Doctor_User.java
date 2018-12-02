package com.karam.doctorpatientappointment.dal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "doctoruser")
public class Doctor_User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer doctorid;
	private String doctorlastname;

	private String doctorfirstname;

	private String doctorstreetaddress;

	private String doctorareaaddress;

	private Integer doctorpostalcode;

	private Integer doctorcontact;

	private Integer doctortype;

	private String doctoremail;
	
	private Integer doctorcityid;

	private String doctorexperience;

	private Integer doctorfees;

	private String doctorgender;

	private String doctorpassword;

	private Integer doctoroverallrating;

	private Boolean doctorsunday;

	private Boolean doctormonday;

	private Boolean doctortuesday;

	private Boolean doctorwednesday;

	private Boolean doctorthursday;

	private Boolean doctorfriday;

	private Boolean doctorsaturday;

	public Integer getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(Integer doctorid) {
		this.doctorid = doctorid;
	}

	public String getDoctorlastname() {
		return doctorlastname;
	}

	public void setDoctorlastname(String doctorlastname) {
		this.doctorlastname = doctorlastname;
	}

	public String getDoctorfirstname() {
		return doctorfirstname;
	}

	public void setDoctorfirstname(String doctorfirstname) {
		this.doctorfirstname = doctorfirstname;
	}

	public String getDoctorstreetaddress() {
		return doctorstreetaddress;
	}

	public void setDoctorstreetaddress(String doctorstreetaddress) {
		this.doctorstreetaddress = doctorstreetaddress;
	}

	public String getDoctorareaaddress() {
		return doctorareaaddress;
	}

	public void setDoctorareaaddress(String doctorareaaddress) {
		this.doctorareaaddress = doctorareaaddress;
	}

	public Integer getDoctorpostalcode() {
		return doctorpostalcode;
	}

	public void setDoctorpostalcode(Integer doctorpostalcode) {
		this.doctorpostalcode = doctorpostalcode;
	}

	public Integer getDoctorcontact() {
		return doctorcontact;
	}

	public void setDoctorcontact(Integer doctorcontact) {
		this.doctorcontact = doctorcontact;
	}

	public Integer getDoctortype() {
		return doctortype;
	}

	public void setDoctortype(Integer doctortype) {
		this.doctortype = doctortype;
	}

	public String getDoctoremail() {
		return doctoremail;
	}

	public void setDoctoremail(String doctoremail) {
		this.doctoremail = doctoremail;
	}

	public Integer getDoctorcityid() {
		return doctorcityid;
	}

	public void setDoctorcityid(Integer doctorcityid) {
		this.doctorcityid = doctorcityid;
	}

	public String getDoctorexperience() {
		return doctorexperience;
	}

	public void setDoctorexperience(String doctorexperience) {
		this.doctorexperience = doctorexperience;
	}

	public Integer getDoctorfees() {
		return doctorfees;
	}

	public void setDoctorfees(Integer doctorfees) {
		this.doctorfees = doctorfees;
	}

	public String getDoctorgender() {
		return doctorgender;
	}

	public void setDoctorgender(String doctorgender) {
		this.doctorgender = doctorgender;
	}

	public String getDoctorpassword() {
		return doctorpassword;
	}

	public void setDoctorpassword(String doctorpassword) {
		this.doctorpassword = doctorpassword;
	}

	public Integer getDoctoroverallrating() {
		return doctoroverallrating;
	}

	public void setDoctoroverallrating(Integer doctoroverallrating) {
		this.doctoroverallrating = doctoroverallrating;
	}

	public Boolean getDoctorsunday() {
		return doctorsunday;
	}

	public void setDoctorsunday(Boolean doctorsunday) {
		this.doctorsunday = doctorsunday;
	}

	public Boolean getDoctormonday() {
		return doctormonday;
	}

	public void setDoctormonday(Boolean doctormonday) {
		this.doctormonday = doctormonday;
	}

	public Boolean getDoctortuesday() {
		return doctortuesday;
	}

	public void setDoctortuesday(Boolean doctortuesday) {
		this.doctortuesday = doctortuesday;
	}

	public Boolean getDoctorwednesday() {
		return doctorwednesday;
	}

	public void setDoctorwednesday(Boolean doctorwednesday) {
		this.doctorwednesday = doctorwednesday;
	}

	public Boolean getDoctorthursday() {
		return doctorthursday;
	}

	public void setDoctorthursday(Boolean doctorthursday) {
		this.doctorthursday = doctorthursday;
	}

	public Boolean getDoctorfriday() {
		return doctorfriday;
	}

	public void setDoctorfriday(Boolean doctorfriday) {
		this.doctorfriday = doctorfriday;
	}

	public Boolean getDoctorsaturday() {
		return doctorsaturday;
	}

	public void setDoctorsaturday(Boolean doctorsaturday) {
		this.doctorsaturday = doctorsaturday;
	}

	@Override
	public String toString() {
		return "Doctor_User [doctorid=" + doctorid + ", doctorlastname=" + doctorlastname + ", doctorfirstname="
				+ doctorfirstname + ", doctorstreetaddress=" + doctorstreetaddress + ", doctorareaaddress="
				+ doctorareaaddress + ", doctorpostalcode=" + doctorpostalcode + ", doctorcontact=" + doctorcontact
				+ ", doctortype=" + doctortype + ", doctoremail=" + doctoremail + ", doctorcityid=" + doctorcityid
				+ ", doctorexperience=" + doctorexperience + ", doctorfees=" + doctorfees + ", doctorgender="
				+ doctorgender + ", doctorpassword=" + doctorpassword + ", doctoroverallrating=" + doctoroverallrating
				+ ", doctorsunday=" + doctorsunday + ", doctormonday=" + doctormonday + ", doctortuesday="
				+ doctortuesday + ", doctorwednesday=" + doctorwednesday + ", doctorthursday=" + doctorthursday
				+ ", doctorfriday=" + doctorfriday + ", doctorsaturday=" + doctorsaturday + "]";
	}

	
}

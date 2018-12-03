/**
 * @author Sunny
 *
 */
package com.karam.doctorpatientappointment.dal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patientuser")
public class Patient_User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer patientid;
	private String patientlastname;
	private String patientfirstname;
	private String patientstreetaddress;
	private String patientareaaddress;
	private Integer patientpostalcode;
	private Integer patientcontact;
	private String patientgender;
	private String patientemail;
	private String patientcity;
	private String patientpassword;
	private Integer patientguardian;

	public Integer getPatientid() {
		return patientid;
	}

	public void setPatientid(Integer patientid) {
		this.patientid = patientid;
	}

	public String getPatientlastname() {
		return patientlastname;
	}

	public void setPatientlastname(String patientlastname) {
		this.patientlastname = patientlastname;
	}

	public String getPatientfirstname() {
		return patientfirstname;
	}

	public void setPatientfirstname(String patientfirstname) {
		this.patientfirstname = patientfirstname;
	}

	public String getPatientstreetaddress() {
		return patientstreetaddress;
	}

	public void setPatientstreetaddress(String patientstreetaddress) {
		this.patientstreetaddress = patientstreetaddress;
	}

	public String getPatientareaaddress() {
		return patientareaaddress;
	}

	public void setPatientareaaddress(String patientareaaddress) {
		this.patientareaaddress = patientareaaddress;
	}

	public Integer getPatientpostalcode() {
		return patientpostalcode;
	}

	public void setPatientpostalcode(Integer patientpostalcode) {
		this.patientpostalcode = patientpostalcode;
	}

	public Integer getPatientcontact() {
		return patientcontact;
	}

	public void setPatientcontact(Integer patientcontact) {
		this.patientcontact = patientcontact;
	}

	public String getPatientgender() {
		return patientgender;
	}

	public void setPatientgender(String patientgender) {
		this.patientgender = patientgender;
	}

	public String getPatientemail() {
		return patientemail;
	}

	public void setPatientemail(String patientemail) {
		this.patientemail = patientemail;
	}

	public String getPatientcity() {
		return patientcity;
	}

	public void setPatientcity(String patientcity) {
		this.patientcity = patientcity;
	}

	public String getPatientpassword() {
		return patientpassword;
	}

	public void setPatientpassword(String patientpassword) {
		this.patientpassword = patientpassword;
	}

	public Integer getPatientguardian() {
		return patientguardian;
	}

	public void setPatientguardian(Integer patientguardian) {
		this.patientguardian = patientguardian;
	}

	@Override
	public String toString() {
		return "Patient_User [patientid=" + patientid + ", patientlastname=" + patientlastname + ", patientfirstname="
				+ patientfirstname + ", patientstreetaddress=" + patientstreetaddress + ", patientareaaddress="
				+ patientareaaddress + ", patientpostalcode=" + patientpostalcode + ", patientcontact=" + patientcontact
				+ ", patientgender=" + patientgender + ", patientemail=" + patientemail + ", patientcity=" + patientcity
				+ ", patientpassword=" + patientpassword + ", patientguardian=" + patientguardian + "]";
	}

}

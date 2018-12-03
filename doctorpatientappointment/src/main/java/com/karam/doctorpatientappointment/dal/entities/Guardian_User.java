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
@Table(name = "guardianuser")
public class Guardian_User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long guardianid;
	private String guardianlastname;
	private String guardianfirstname;
	private String guardianstreetname;
	private String guardianareaname;
	private Integer guardiancity;
	private Integer guardianpostalcode;
	private Integer guardiancontact;
	private String guardianemail;

	public Long getGuardianid() {
		return guardianid;
	}

	public void setGuardianid(Long guardianid) {
		this.guardianid = guardianid;
	}

	public String getGuardianlastname() {
		return guardianlastname;
	}

	public void setGuardianlastname(String guardianlastname) {
		this.guardianlastname = guardianlastname;
	}

	public String getGuardianfirstname() {
		return guardianfirstname;
	}

	public void setGuardianfirstname(String guardianfirstname) {
		this.guardianfirstname = guardianfirstname;
	}

	public String getGuardianstreetname() {
		return guardianstreetname;
	}

	public void setGuardianstreetname(String guardianstreetname) {
		this.guardianstreetname = guardianstreetname;
	}

	public String getGuardianareaname() {
		return guardianareaname;
	}

	public void setGuardianareaname(String guardianareaname) {
		this.guardianareaname = guardianareaname;
	}

	public Integer getGuardiancity() {
		return guardiancity;
	}

	public void setGuardiancity(Integer guardiancity) {
		this.guardiancity = guardiancity;
	}

	public Integer getGuardianpostalcode() {
		return guardianpostalcode;
	}

	public void setGuardianpostalcode(Integer guardianpostalcode) {
		this.guardianpostalcode = guardianpostalcode;
	}

	public Integer getGuardiancontact() {
		return guardiancontact;
	}

	public void setGuardiancontact(Integer guardiancontact) {
		this.guardiancontact = guardiancontact;
	}

	public String getGuardianemail() {
		return guardianemail;
	}

	public void setGuardianemail(String guardianemail) {
		this.guardianemail = guardianemail;
	}

	@Override
	public String toString() {
		return "Guardian_User [guardianid=" + guardianid + ", guardianlastname=" + guardianlastname
				+ ", guardianfirstname=" + guardianfirstname + ", guardianstreetname=" + guardianstreetname
				+ ", guardianareaname=" + guardianareaname + ", guardiancity=" + guardiancity + ", guardianpostalcode="
				+ guardianpostalcode + ", guardiancontact=" + guardiancontact + ", guardianemail=" + guardianemail
				+ "]";
	}

}

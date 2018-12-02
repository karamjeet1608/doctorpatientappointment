package com.karam.doctorpatientappointment.dal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cityvault")

public class City_Vault {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cityid;
	private String cityname;
	private String citydescription;

	public Integer getCityid() {
		return cityid;
	}

	public void setCityid(Integer cityid) {
		this.cityid = cityid;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getCitydescription() {
		return citydescription;
	}

	public void setCitydescription(String citydescription) {
		this.citydescription = citydescription;
	}

	@Override
	public String toString() {
		return "City_Vault [cityid=" + cityid + ", cityname=" + cityname + ", citydescription=" + citydescription + "]";
	}

}

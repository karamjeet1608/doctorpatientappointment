package com.karam.doctorpatientappointment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.karam.doctorpatientappointment.dal.entities.Doctor_User;
import com.karam.doctorpatientappointment.dal.respository.DoctorUserRepository;

public class doctorUserController {

	@Autowired
	private DoctorUserRepository doctoruserRepository;
	
	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		return"login/doctorregisterUser";
		
	}
	
	@RequestMapping(value="doctorregisterUser",method=RequestMethod.POST)
	public String register(@ModelAttribute("doctor_user")Doctor_User doctoruser)   {
		
		doctoruserRepository.save(doctoruser);
		return"login/login";
}
	
	@GetMapping(value="/login/{doctoremail}/{doctorpassword}")
	public String login(@PathVariable("doctoremail")String doctoremail,
			@PathVariable("doctorpassword")String doctorpassword,
			ModelMap modelMap) {
		
		Doctor_User doctor_User = doctoruserRepository.getBydoctoremail(doctoremail);
		if (doctor_User.getDoctorpassword().equals(doctorpassword)) {
			
			return"dashboard";
		} else {
			modelMap.addAttribute("msg","Invalid Credentials");
			return"login/login";
		}
	}
	
	@RequestMapping("/registerUser")
	public String showDashboardPage() {
		return"login/dashboard";
		
	}
}
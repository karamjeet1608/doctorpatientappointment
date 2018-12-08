package com.karam.doctorpatientappointment.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private static final Logger LOGGER = LoggerFactory.getLogger(doctorUserController.class);
	
	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		
		LOGGER.info("inside showRegistrationPage");
		return"login/doctorregisterUser";
		
	}
	
	@RequestMapping(value="doctorregisterUser",method=RequestMethod.POST)
	public String register(@ModelAttribute("doctor_user")Doctor_User doctoruser)   {
		
		LOGGER.info("register");
		
		doctoruserRepository.save(doctoruser);
		return"login/login";
}
	
	@GetMapping(value="/login/{doctoremail}/{doctorpassword}")
	public String login(@PathVariable("doctoremail")String doctoremail,
			@PathVariable("doctorpassword")String doctorpassword,
			ModelMap modelMap) {
		
		LOGGER.info("login");
		
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
		
		LOGGER.info("showDashboardPage");
		return"login/dashboard";
		
	}
}
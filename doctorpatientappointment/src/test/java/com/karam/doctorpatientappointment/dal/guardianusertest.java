package com.karam.doctorpatientappointment.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.karam.doctorpatientappointment.dal.entities.Guardian_User;
import com.karam.doctorpatientappointment.dal.respository.GuardianUserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class guardianusertest {

	@Autowired
	private GuardianUserRepository GuardianUserRepository;

	@Test
	public void testaddguardianuser() {

		Guardian_User guardian = new Guardian_User();
		guardian.setGuardianfirstname("Tester");
		guardian.setGuardianlastname("Tester");
		guardian.setGuardiancity(1);
		guardian.setGuardiancontact(1478);
		guardian.setGuardianemail("test@1.com");
		guardian.setGuardianpostalcode(69123);
		guardian.setGuardianareaname("Test");
		guardian.setGuardianstreetname("tester");

		GuardianUserRepository.save(guardian);

	}

}

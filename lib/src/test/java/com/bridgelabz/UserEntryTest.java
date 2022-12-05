package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserEntryTest {
	
	UserEntry userEntry = new UserEntry();

	@Test
	public void testToValidate_FirstName() {
		boolean result = userEntry.firstName("Ramesh");
		Assertions.assertTrue(result);
	}
	
	@Test
	public void testToValidate_LastName() {
		boolean result = userEntry.lastName("Malli");
		Assertions.assertTrue(result);
	}
	
	@Test
	public void testToValidate_EmailAddress() {
		boolean result = userEntry.emailAddress("ram221@gmail.com");
		Assertions.assertTrue(result);	
	}
	
	@Test
	public void testToValidate_MobileNumber() {
		boolean result = userEntry.mobileNumber("91 8431510221");
		Assertions.assertTrue(result);
	}
	
	@Test
	public void testToValidate_Password() {
		boolean result = userEntry.password("ram@221");
		Assertions.assertTrue(result);
	}
}

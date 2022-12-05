package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistarctionTest {

	 UserRegistraction userRegistarction = new UserRegistraction();
		
		/* First Name Start With Cap and Minimum 3 characters*/
		@Test
		public void givenFirstName_WhenFormat_ShouldReturnTrue() {
			boolean result = userRegistarction.firstName("Ram");	
			Assertions.assertEquals(true, result);
		}
		
		@Test
		public void givenFirstName_WhenFormat_ShouldreturnFalse() {
			boolean result = userRegistarction.firstName("ram");	
			Assertions.assertEquals(false, result);
		}
		
		
		/* Last Name Start With Cap and Minimum 3 characters*/
		@Test 
		public void givenSecondName_WhenFormat_ShouldReturnFalse() {
			 boolean result = userRegistarction.secondName("malli");
			 Assertions.assertEquals(false, result);
		}
		

		@Test 
		public void givenSecondName_WhenFormat_ShouldReturnTrue() {
			 boolean result = userRegistarction.secondName("Malli");
			 Assertions.assertEquals(true, result);
		}
		
		/*Email Address Mandatory abc,bl,co and Position @ and . */
		@Test
		public void givenEmailAddress_WhenFormat_ShouldReturnTrue() {
			boolean result = userRegistarction.emailAddress("abc.xyz@bl.co.in");
			Assertions.assertEquals(true, result);
		}
		
		@Test
		public void givenEmailAddress_WhenFormat_ShouldReturnFalse() {
			boolean result = userRegistarction.emailAddress("Abc.xyz@bl.co.in");
			Assertions.assertEquals(false, result);
		}
}

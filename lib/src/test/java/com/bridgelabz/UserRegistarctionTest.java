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
}

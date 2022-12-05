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

	/*Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10
        digit number*/

	@Test
	public void givenPhoneNumber_ShouldReturnTrue() {
		boolean result = userRegistarction.phoneNumber("91 8431510221");
		Assertions.assertEquals(true, result);
	}

	@Test
	public void givenphoneNumber_ShouldReturnFasle() {
		boolean result = userRegistarction.phoneNumber("91 5496879626");
		Assertions.assertEquals(false, result);
	}
	
	/*Rule1 – minimum 8 Characters*/ 

	@Test
	public void givenRule_1_ShouldReturnTrue() {
		boolean result = userRegistarction.rule1Password("javabatch");
		Assertions.assertEquals(true, result);	
	}

	@Test
	public void givenRule_1_ShouldReturnFalse() {
		boolean result = userRegistarction.rule1Password("JavaBatch");
		Assertions.assertEquals(false, result);
	}
	
	/* Rule2 Should have at least 1 Upper Case - NOTE – All rules must be passed*/
	@Test
	public void givenRull_2_ShouldReturnTrue() {
		boolean result = userRegistarction.rule2Password("Javabatch");
		Assertions.assertEquals(true, result);
	}

	@Test
	public void givenRull_2_ShouldReturnFalse() {
		boolean result = userRegistarction.rule2Password("javabatch");
		Assertions.assertEquals(false, result);
	}
	
	/*Rule3 Should have at least 1 numeric number in
         the password - NOTE – All rules must be passed*/
	@Test
	public void givenRull_3_ShouldReturnTrue() {
		boolean result = userRegistarction.rule3Password("Javabatch219");
		Assertions.assertEquals(true, result);
	}

	@Test
	public void givenRull_3_ShouldReturnFalse() {
		boolean result = userRegistarction.rule3Password("javabatch219");
		Assertions.assertEquals(false, result);
	}
}

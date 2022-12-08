package com.bridgelabz;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class UserRegistarctionTest {

	UserRegistraction user = new UserRegistraction();

    @Test
    public void giveFirstName_shouldReturnTrue() {
        try {
            boolean result = user.validFirstName.validate("Ramesh");
            Assertions.assertEquals(true,result);
            System.out.println("First name is valid");
        } catch (InvalidInputException e) {
            System.out.println("Inalid First name: " + e);
        }
    }

    @Test
    public void giveFirstName_ShouldReturnFalse() {
        try {
            boolean result = user.validFirstName.validate("ramesh");
            Assertions.assertEquals(false,result);
            System.out.println("First name is valid:");
        } catch (InvalidInputException e) {
            System.out.println(" First name is Invalid: " + e);
        }
    }

    @Test
    public void giveLastName_shouldReturnTrue() {
        try {
            boolean result = user.validLastName.validate("Malli");
            Assertions.assertEquals(true,result);
            System.out.println("Last name is valid");
        } catch (InvalidInputException e) {
            System.out.println("Last name is invalid:" + e);
        }
    }

    @Test
    public void giveLastName_shouldReturnFalse() {
        try {
            boolean result = user.validLastName.validate("malli");
            Assertions.assertEquals(false,result);
            System.out.println("Last name is valid");
        } catch (InvalidInputException e) {
            System.out.println("Invalid lastname: "+e);
        }
    }

    @Test
    public void giveEmail_shouldReturnTrue() {
        try {
            boolean result = user.validEmail.validate("abc.xyz@bl.co.in");
            Assertions.assertEquals(true,result);
            System.out.println("Email is valid");
        } catch (InvalidInputException e) {
            System.out.println("Email is invalid:"+e);
        }
    }

    @Test
    public void giveEmail_shouldReturnFalse() {
        try {
            boolean result = user.validEmail.validate("ram221@gmail");
            Assertions.assertEquals(false,result);
            System.out.println("Email is valid");
        } catch (InvalidInputException e) {
            System.out.println("Email is invalid"+e);
        }
    }

    @Test
    public void givenMobileNo_ShouldReturnTrue() {
        try {
            boolean result = user.validMobileNumber.validate("91 8431510221");
            Assertions.assertEquals(true,result);
            System.out.println("Mob no. is valid");
        } catch (InvalidInputException e) {
            System.out.println("Mobile no is invalid"+e);
        }
    }

    @Test
    public void givenMobileNo_ShouldReturnsFalse() {
        try {
            boolean result = user.validMobileNumber.validate("956258459");
            Assertions.assertEquals(false,result);
            System.out.println("Mob no is valid");
        } catch (InvalidInputException e) {
            System.out.println("Mob no is invalid " +e);
        }
    }

    @Test
    public void givenPassword__ShouldReturnTrue() {
    	try {
    		boolean result = user.validPassword.validate("Rameshm@1");
    		Assertions.assertEquals(true, result);
    		System.out.println("password is valid");
    	} catch (InvalidInputException e) {
    		System.out.println("Password is invalid"+e);
    	}
    }

    @Test
    public void givenPassword__ShouldReturnsFalse() {
        try {
            boolean result = user.validPassword.validate("ram");
            Assertions.assertEquals(false,result);
            System.out.println("Password  is valid");
        } catch (InvalidInputException e) {
            System.out.println("Password  is invalid"+e);
        }
    }

    @Test
    public void givenEmailSample_ShouldReturnTrue() {
        try {
            boolean result = user.validEmailSamples.validate("abc@gmail.com.com");
            Assertions.assertEquals(true,result);
            System.out.println("Email sample is valid:");
        } catch (InvalidInputException e) {
            System.out.println("Email sample is invalid"+e);
        }
    }

    @Test
    public void givenEmailSample_ShouldReturnFalse() {
        try {
            boolean result = user.validEmailSamples.validate("ram221@.com");
            Assertions.assertEquals(false,result);
            System.out.println("Email sample is valid");
        } catch (InvalidInputException e) {
            System.out.println("Email sample is invalid"+e);
        }
    }
}

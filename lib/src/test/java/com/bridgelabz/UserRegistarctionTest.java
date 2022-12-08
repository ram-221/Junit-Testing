package com.bridgelabz;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class UserRegistarctionTest {

	UserRegistraction user = new UserRegistraction();

    @Test
    public void giveFirstName_shouldGiveTrue() {
        try {
            boolean result = user.validFirstName("Ramesh");
            Assertions.assertEquals(true,result);
            System.out.println("First name is valid");
        } catch (InvalidInputException e) {
            System.out.println("Inalid First name: " + e);
        }
    }

    @Test
    public void giveFirstName_ShouldGiveFalse() {
        try {
            boolean result = user.validFirstName("ramesh");
            Assertions.assertEquals(false,result);
            System.out.println("First name is valid:");
        } catch (InvalidInputException e) {
            System.out.println(" First name is Invalid: " + e);
        }
    }

    @Test
    public void giveLastName_shouldGiveTrue() {
        try {
            boolean result = user.validLastName("Malli");
            Assertions.assertEquals(true,result);
            System.out.println("Last name is valid");
        } catch (InvalidInputException e) {
            System.out.println("Last name is invalid:" + e);
        }
    }

    @Test
    public void givelastName_shouldGiveFalse() {
        try {
            boolean result = user.validLastName("malli");
            Assertions.assertEquals(false,result);
            System.out.println("Last name is valid");
        } catch (InvalidInputException e) {
            System.out.println("Invalid lastname: "+e);
        }
    }

    @Test
    public void giveEmail_shouldGiveTrue() {
        try {
            boolean result = user.validEmail("abc.xyz@bl.co.in");
            Assertions.assertEquals(true,result);
            System.out.println("Email is valid");
        } catch (InvalidInputException e) {
            System.out.println("Email is invalid:"+e);
        }
    }

    @Test
    public void giveEmail_shouldGiveFalse() {
        try {
            boolean result = user.validEmail("ram221@gmail");
            Assertions.assertEquals(false,result);
            System.out.println("Email is valid");
        } catch (InvalidInputException e) {
            System.out.println("Email is invalid"+e);
        }
    }

    @Test
    public void givenMobileNo_ShouldReturnsTrue() {
        try {
            boolean result = user.validMobileNumber("91 8431510221");
            Assertions.assertEquals(true,result);
            System.out.println("Mob no. is valid");
        } catch (InvalidInputException e) {
            System.out.println("Mobile no is invalid"+e);
        }
    }

    @Test
    public void givenMobileNo_ShouldReturnsFalse() {
        try {
            boolean result = user.validMobileNumber("956258459");
            Assertions.assertEquals(false,result);
            System.out.println("Mob no is valid");
        } catch (InvalidInputException e) {
            System.out.println("Mob no is invalid " +e);
        }
    }


    @Test
    public void givenPassword__ShouldReturnsFalse() {
        try {
            boolean result = user.validSymbolPassword("RameshmK@");
            Assertions.assertEquals(false,result);
            System.out.println("Password Rule 4 is valid");
        } catch (InvalidInputException e) {
            System.out.println("Password Rule 4 is invalid"+e);
        }
    }

    @Test
    public void givenEmailSample_ShouldReturnTrue() {
        try {
            boolean result = user.validEmailSamples("abc@gmail.com.com");
            Assertions.assertEquals(true,result);
            System.out.println("Email sample is valid:");
        } catch (InvalidInputException e) {
            System.out.println("Email sample is invalid"+e);
        }
    }

    @Test
    public void givenEmailSample_ShouldReturnFalse() {
        try {
            boolean result = user.validEmailSamples("ram221@.com");
            Assertions.assertEquals(false,result);
            System.out.println("Email sample is valid");
        } catch (InvalidInputException e) {
            System.out.println("Email sample is invalid"+e);
        }
    }
}

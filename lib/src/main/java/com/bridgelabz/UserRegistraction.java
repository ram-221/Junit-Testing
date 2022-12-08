package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface Validation {
	boolean validate (String s) throws InvalidInputException;
}

public class UserRegistraction {
	
	/*
    enter valid first name
     */
    Validation validFirstName =(fname)->  {

        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fname);
        boolean result = matcher.matches();
        System.out.println(result);
        if (!result) {
            throw new InvalidInputException("first Name should start with a Cap and should have minimum 3 characters");
        } else
            return true;
    };
  
    /*
    Enter Valid Last name
     */

    Validation validLastName = (lName) -> {

        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lName);
        boolean result = matcher.matches();
        System.out.println(result);
        if (!result) {
            throw new InvalidInputException("Last Name should start with a Cap and should have minimum 3 chars");
        } else {
            return true;
        }
    };

    /*
    Enter valid Email
     */

    Validation validEmail = (email) -> {

        String regex = "^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        System.out.println(result);
        if (!result) {
            throw new InvalidInputException("Enter valid Email");
        } else
            return true;
    };
  
    /*
    Enter valid mobile number
     */

    Validation validMobileNumber = (mobileNumber) -> {

        String regex = "^[0-9]{2}\\s{0,1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        boolean result = matcher.matches();
        System.out.println(result);
        if (!result) {
            throw new InvalidInputException("Enter the Valid Mobile number with county code.");
        } else
            return true;
    };

       
    /*
    Password contains at least 1 Upper case, 1 Special char, 1 numeric number and minimum 5 char
    */

    Validation validPassword = (password1) -> {

        String regex = "^[A-Z]{1}+[a-zA-Z]{6,}+[@]{1}[1-9]{1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password1);
        boolean result = matcher.matches();
        System.out.println(result);
        if (!result) {
            throw new InvalidInputException("Password contains atleast 1 Uppercase, 1 numeric 1 Special Char");
        } else
            return true;
    };
   
    /*
    valid email samples
     */

    Validation validEmailSamples = (samplemail) -> {

        String regex = "^[a-zA-Z0-9]+(@.+-_][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(samplemail);
        boolean result = matcher.matches();
        System.out.println(result);
        if (!result) {
            throw new InvalidInputException("valid email samples");
        } else
        return true;
    };

}

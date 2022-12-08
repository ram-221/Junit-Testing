package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistraction {
	 /*
    enter valid first name
     */
    public boolean validFirstName(String name) throws InvalidInputException {

        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        System.out.println(result);
        if (!result) {
            throw new InvalidInputException("first Name should start with a Cap and should have minimum 3 characters");
        } else
            return true;
    }
    /*
    Enter Valid Last name
     */

    public boolean validLastName(String lastName) throws InvalidInputException {

        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();
        System.out.println(result);
        if (!result) {
            throw new InvalidInputException("Last Name should start with a Cap and should have minimum 3 chars");
        } else {
            return true;
        }
    }

    /*
    Enter valid Email
     */

    public boolean validEmail(String Email) throws InvalidInputException {

        String regex = "^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Email);
        boolean result = matcher.matches();
        System.out.println(result);
        if (!result) {
            throw new InvalidInputException("Enter valid Email");
        } else
            return true;
    }
    /*
    Enter valid mobile number
     */

    public boolean validMobileNumber(String MobileNumber) throws InvalidInputException {

        String regex = "^[0-9]{2}\\s{0,1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(MobileNumber);
        boolean result = matcher.matches();
        System.out.println(result);
        if (!result) {
            throw new InvalidInputException("Enter the Valid Mobile number with county code.");
        } else
            return true;
    }

       
    /*
    Password contains atleast 1 Uppercase, 1 Special char, 1 numeric number and minimum 5 char
    */

    public boolean validSymbolPassword(String password1) throws InvalidInputException {

        String regex = "^[A-Z]{1}+[a-zA-Z]{6,}+[@]{1}[1-9]{1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password1);
        boolean result = matcher.matches();
        System.out.println(result);
        if (!result) {
            throw new InvalidInputException("Password contains atleast 1 Special Char");
        } else
            return true;
    }
    /*
    valid email samples
     */

    public boolean validEmailSamples(String Email) throws InvalidInputException {

        String regex = "^[a-zA-Z0-9]+(@.+-_][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Email);
        boolean result = matcher.matches();
        System.out.println(result);
        if (!result) {
            throw new InvalidInputException("valid email samples");
        } else
        return true;
    }

}

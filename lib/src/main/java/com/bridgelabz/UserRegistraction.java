package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistraction {
	
	/* First Name Start With Cap and Minimum 3 characters*/

	public   boolean firstName(String name) {
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(name);
		return m.matches();	
	}
	
	/* Last Name Start With Cap and Minimum 3 characters*/
	
	public boolean secondName(String lName) {
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(lName);
		return m.matches();
	}
	
	/*Email Address Mandatory abc,bl,co and Position @ and . */
	
	public boolean emailAddress(String email) {
		String regex =  "abc[.][a-zA-Z0-9]*[@]bl[.]co[.][a-zA-Z0-9]*";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(email);
		return m.matches();	
	}
	
	/*Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10
    digit number*/

	public boolean phoneNumber(String pNumber) {
		String regex = "^[1-9]{2}\\s[6-9]*[0-9]{9}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(pNumber);
		return m.matches();
	}
	
	/*Rule1 – minimum 8 Characters*/ 
	
	public boolean rule1Password(String rull1) {
		String regex = "[a-z]{8,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(rull1);
		return m.matches();	
	}
	
	/* Rule2 Should have at least 1 Upper Case - NOTE – All rules must be passed*/
	
	public boolean rule2Password(String rull2) {
		String regex = "[A-Z]+[a-z]{7,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(rull2);
		return m.matches();	
	}
	
	/*Rule3 Should have at least 1 numeric number in
    the password - NOTE – All rules must be passed*/
	
	public boolean rule3Password(String rull3) {
		String regex = "[A-Z]+[a-z]{6,}[0-9]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(rull3);
		return m.matches();
	}
	
	/*Rule4 – Has exactly 1 Special Character
	 All rules must be passed*/
	
	public boolean rule4Password(String rull4) {
		String regex = "[A-Z]+[a-z]{5,}[@][0-9]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(rull4);
		return m.matches();		
	}

	/*Samples Emails*/
	
	public boolean samplesEmail(String email) {
		String regex = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(email);
		return m.matches();	
	}


}

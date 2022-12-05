package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserEntry {

	public boolean firstName(String fName) {
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(fName);
		return m.matches();	
	}

	public boolean lastName(String lName) {
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(lName);
		return m.matches();
		
	}

	public boolean emailAddress(String email) {
		String regex = "[a-z0-9 @ . ]*";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(email);
		return m.matches();	
	}

	public boolean mobileNumber(String number) {
		String regex =  "^[1-9]{2}\\s[6-9]*[0-9]{9}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(number);
		return m.matches();	
	}

	public boolean password(String password) {
		String regex = "[@ . A-Za-z0-9]*";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(password);
		return m.matches();	
	}

}

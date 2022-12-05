package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistraction {

	public   boolean firstName(String name) {
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(name);
		return m.matches();	
	}
	
	public boolean secondName(String lName) {
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(lName);
		return m.matches();
	}
	
	public boolean emailAddress(String email) {
		String regex =  "abc[.][a-zA-Z0-9]*[@]bl[.]co[.][a-zA-Z0-9]*";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(email);
		return m.matches();
		
	}

}

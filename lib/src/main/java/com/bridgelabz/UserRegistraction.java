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
	
	public boolean phoneNumber(String pNumber) {
		String regex = "^[1-9]{2}\\s[6-9]*[0-9]{9}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(pNumber);
		return m.matches();
	}
	
	public boolean rule1Password(String rull1) {
		String regex = "[a-z]{8,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(rull1);
		return m.matches();	
	}
	
	public boolean rule2Password(String rull2) {
		String regex = "[A-Z]+[a-z]{7,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(rull2);
		return m.matches();	
	}
	public boolean rule3Password(String rull3) {
		String regex = "[A-Z]+[a-z]{6,}[0-9]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(rull3);
		return m.matches();
	}
	
	public boolean rule4Password(String rull4) {
		String regex = "[A-Z]+[a-z]{5,}[@][0-9]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(rull4);
		return m.matches();		
	}

	public boolean samplesEmail(String email) {
		String regex = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(email);
		return m.matches();	
	}


}

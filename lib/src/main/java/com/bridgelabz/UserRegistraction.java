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
}

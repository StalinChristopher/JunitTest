package com.yml.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
	final String NAME = "^[A-Z]{1}[a-zA-Z]{2,}";
	
	public boolean validateFirstName(String firstName) {
		return Pattern.matches(NAME, firstName);
	}
}

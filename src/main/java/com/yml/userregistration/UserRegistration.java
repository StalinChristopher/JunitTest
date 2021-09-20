package com.yml.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
	final String NAME = "^[A-Z]{1}[a-zA-Z]{2,}";
	final String EMAIL = "^[0-9a-zA-Z]+([.+_\\-][0-9a-zA-Z]*)*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})*$";
	
	public boolean validateFirstName(String firstName) {
		return Pattern.matches(NAME, firstName);
	}
	
	public boolean validateLastName(String lastName) {
		return Pattern.matches(NAME, lastName);
	}
	
	public boolean validateEmail(String email) {
		return Pattern.matches(EMAIL, email);
	}
}

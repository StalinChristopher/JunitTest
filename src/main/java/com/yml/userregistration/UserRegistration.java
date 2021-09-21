package com.yml.userregistration;

import java.util.regex.Pattern;

import com.yml.customexceptions.InvalidEmailException;
import com.yml.customexceptions.InvalidFirstNameException;
import com.yml.customexceptions.InvalidLastNameException;
import com.yml.customexceptions.InvalidPasswordException;
import com.yml.customexceptions.InvalidPhoneException;

public class UserRegistration {

	final String NAME = "^[A-Z]{1}[a-zA-Z]{2,}";
	final String EMAIL = "^[0-9a-zA-Z]+([.+_\\-][0-9a-zA-Z]*)*@[0-9a-zA-Z]+\\.[a-zA-Z]{2,4}(\\.[a-zA-Z]{2})*$";
	final String PHONE = "[0-9]{2}[\\s][0-9]{10}";
	final String PASSWORD = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%&!]).{8,}";

	public boolean validateFirstName(String firstName) throws InvalidFirstNameException {
		boolean result = Pattern.matches(NAME, firstName);
		if (result) {
			return true;
		} else {
			throw new InvalidFirstNameException("Given first name is invalid ");
		}
	}

	public boolean validateLastName(String lastName) throws InvalidLastNameException {
		boolean result = Pattern.matches(NAME, lastName);
		if (result) {
			return true;
		} else {
			throw new InvalidLastNameException("Given last name is invalid");
		}
	}

	public boolean validateEmail(String email) throws InvalidEmailException {
		boolean result = Pattern.matches(EMAIL, email);
		if (result) {
			return true;
		} else {
			throw new InvalidEmailException("Given email is invalid");
		}
	}

	public boolean validatePhone(String phone) throws InvalidPhoneException {
		boolean result = Pattern.matches(PHONE, phone);
		if (result) {
			return true;
		} else {
			throw new InvalidPhoneException("Given phone number is invalid");
		}
	}

	public boolean validatePassword(String password) throws InvalidPasswordException {
		boolean result = Pattern.matches(PASSWORD, password);
		if (result) {
			return true;
		} else {
			throw new InvalidPasswordException("Given password is invalid");
		}
	}

	// All given email sample cases have been validated
}

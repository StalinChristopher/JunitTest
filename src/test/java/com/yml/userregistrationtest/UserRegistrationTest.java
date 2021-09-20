package com.yml.userregistrationtest;

import org.junit.Assert;
import org.junit.Test;

import com.yml.userregistration.UserRegistration;

public class UserRegistrationTest {
	
	/**
	 * Test case for correct name with minimum 3 characters starting with capital letter
	 */
	@Test
	public void firstname_ifcorrect_returntrue() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validateFirstName("Stalin");
		Assert.assertTrue(result);
	}
	
	/**
	 * Test case for firstname with less than 3 characters, it will return false
	 */
	@Test
	public void firstname_haslessthan3characters_returnfalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validateFirstName("ab");
		Assert.assertFalse(result);
	}
	
	/**
	 * Test case for firstname with name not starting with capital latter
	 */
	@Test
	public void firstname_ifdoesnotstartwithcapital_returnfalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validateFirstName("ab");
		Assert.assertFalse(result);
	}
	
	/**
	 * Test case for correct name with minimum 3 characters starting with capital letter
	 */
	@Test
	public void lasttname_ifcorrect_returntrue() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validateLastName("Dsouza");
		Assert.assertTrue(result);
	}
	
	/**
	 * Test case for lastname with less than 3 characters, it will return false
	 */
	@Test
	public void lasstname_haslessthan3characters_returnfalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validateLastName("ab");
		Assert.assertFalse(result);
	}
	
	/**
	 * Test case for lastname with name not starting with capital latter
	 */
	@Test
	public void lastname_ifdoesnotstartwithcapital_returnfalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validateLastName("afasfas");
		Assert.assertFalse(result);
	}
	
	/**
	 * Test case for valid email
	 */
	@Test
	public void givenemail_ifvalid_returntrue() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateEmail("stalin_205@gmail.com");
		Assert.assertTrue(result);
	}
	
	/**
	 * Test case passes when invalid  mail id is given
	 */
	@Test
	public void givenemail_ifinvalid_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateEmail("abc.com");
		Assert.assertFalse(result);
	}
}

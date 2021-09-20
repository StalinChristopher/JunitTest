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
	
	/**
	 * Test case for valid phone number
	 */
	@Test
	public void givenphonenumber_itisproper_returntrue() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePhone("91 9344235951");
		Assert.assertTrue(result);
	}
	
	/**
	 * Test case fails if no country code is given
	 */
	@Test
	public void givenphonenumber_withoutcountrycode_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePhone("9334414143");
		Assert.assertFalse(result);
	}
	
	/**
	 * Test case fails if there is no 10 digits in phone number
	 */
	@Test
	public void givenphonenumber_lessthantendigit_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePhone("91 966088676");
		Assert.assertFalse(result);
	}
	
	/**
	 * Test case passes because it is invalid to have more than 
	 * 1 space after country code for mobile number 
	 */
	@Test
	public void givenphonenumber_morethanonespaceaftercountrycode_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePhone("91  9860886760");
		Assert.assertFalse(result);
	}
	
	/**
	 * Test case for valid password with more than 8 characters
	 */
	@Test
	public void givenpassword_ifmorethan8characters_returntrue() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("afaafaAs@ff6a");
		Assert.assertTrue(result);
	}
	
	/**
	 * Test case for invalid password with less than 8 characters
	 */
	@Test
	public void givenpassword_iflessthan8characters_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("faa34f");
		Assert.assertFalse(result);
	}
	

	@Test
	public void givenpassword_ifcontainsatleast1capital_returntrue() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("dfdfA@232");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenpassword_ifdoesnotcontainsatleast1capital_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("dfdfr232");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenpassword_ifcontainsatleast1digit_returntrue() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("dfdf@A232");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenpassword_ifdoesnotcontainsatleast1figit_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("dfdfArsdsd");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenpassword_ifdoesnotcontainsatleast1specialcharacter_returnfalse() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("dfdfArsdsd");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenpassword_satisfiesallconditions_returntrue() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validatePassword("tempA12@abc");
		Assert.assertTrue(result);
	}
	
	
	
}

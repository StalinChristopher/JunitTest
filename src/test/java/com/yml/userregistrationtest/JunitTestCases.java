package com.yml.userregistrationtest;

import org.junit.Assert;
import org.junit.Test;

import com.yml.userregistration.UserRegistration;

public class JunitTestCases {
	
	@Test
    public void happyTest() throws Exception {
		UserRegistration userReg = new UserRegistration();

        String firstName = "Johny";
        String lastName = "English";
        String email = "john_English.@gmail.com";
        String mobile = "91 9435221543";
        String password = "passWord123@";

        boolean firstNameRes = userReg.validateFirstName(firstName);
        boolean lastNameRes = userReg.validateFirstName(lastName);
        boolean emailRes = userReg.validateEmail(email);
        boolean mobileRes = userReg.validatePhone(mobile);
        boolean passwordRes = userReg.validatePassword(password);

        Assert.assertTrue(firstNameRes);
        Assert.assertTrue(lastNameRes);
        Assert.assertTrue(emailRes);
        Assert.assertTrue(mobileRes);
        Assert.assertTrue(passwordRes);
    }
    
    /**
     * Tests all negative cases
     * @throws Exception
     */
    @Test
    public void sadTest() throws Exception {
        UserRegistration userReg = new UserRegistration();
        String firstName = "abc";
        String lastName = "xyz";
        String email = "12abc.carlgmail";
        String mobile = "91 8323";
        String password = "temp";

        boolean firstNameRes = userReg.validateFirstName(firstName);
        boolean lastNameRes = userReg.validateFirstName(lastName);
        boolean emailRes = userReg.validateEmail(email);
        boolean mobileRes = userReg.validatePhone(mobile);
        boolean passwordRes = userReg.validatePassword(password);

        Assert.assertFalse(firstNameRes);
        Assert.assertFalse(lastNameRes);
        Assert.assertFalse(emailRes);
        Assert.assertFalse(mobileRes);
        Assert.assertFalse(passwordRes);
    }
}

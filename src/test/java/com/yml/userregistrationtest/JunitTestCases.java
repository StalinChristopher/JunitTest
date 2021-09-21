package com.yml.userregistrationtest;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.yml.userregistration.UserRegistration;

@RunWith(Parameterized.class)
public class JunitTestCases {
	private UserRegistration userReg;
	private String email;
	
	public JunitTestCases(String email) {
		this.email = email;
	}
	
	@Before
	public void initialize() {
		userReg = new UserRegistration();
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(
				new Object[][] {
					{"xyz@gmail.com"},
					{"abc_205@gmail.com"},
					{"abc20@gmail.com"},
					{"xyz.abc@gmail.com"},
					
					{"abcgmail.com"},
					{"abc@gmail"},
					{"abc@.com"},
					{"123@gmail.com.ind"}
				});
	}
	
	@Test
	public void testUseremail() {
		System.out.println("Email : "+email+"\n");
		Assert.assertTrue(userReg.validateEmail(this.email));
	}
	
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

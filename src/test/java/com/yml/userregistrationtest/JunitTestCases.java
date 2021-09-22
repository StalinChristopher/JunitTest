package com.yml.userregistrationtest;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.yml.customexceptions.InvalidEmailException;
import com.yml.customexceptions.InvalidFirstNameException;
import com.yml.customexceptions.InvalidLastNameException;
import com.yml.customexceptions.InvalidPasswordException;
import com.yml.customexceptions.InvalidPhoneException;
import com.yml.userregistration.UserRegistration;
import com.yml.userregistration.ValidationInterface;

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
        return Arrays.asList(new Object[][] { { "xyz@gmail.com" }, { "abc_205@gmail.com" }, { "abc20@gmail.com" },
                { "xyz.abc@gmail.com" },

                { "abcgmail.com" }, { "abc@gmail" }, { "abc@.com" }, { "123@gmail.com.ind" } });
    }

    @Test
    public void testUseremail() throws InvalidEmailException {
        System.out.println("Email : " + email + "\n");
        try {
            Assert.assertTrue(userReg.validateEmail(this.email));
        } catch (InvalidEmailException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void happyTest() throws Exception {
        UserRegistration userReg = new UserRegistration();

        String firstName = "Johny";
        String lastName = "English";
        String email = "john_English.@gmail.com";
        String mobile = "91 9435221543";
        String password = "passWord123@";
        ValidationInterface validator = (fName, lName, mail, phone, pword) -> {
            try {
                Assert.assertTrue(userReg.validateFirstName(fName));
                Assert.assertTrue(userReg.validateLastName(lName));
                Assert.assertTrue(userReg.validateEmail(mail));
                Assert.assertTrue(userReg.validatePhone(phone));
                Assert.assertTrue(userReg.validatePassword(pword));
            } catch (InvalidFirstNameException ifn) {
                ifn.printStackTrace();
            }catch (InvalidLastNameException iln) {
                iln.printStackTrace();
            }catch (InvalidEmailException ie) {
                ie.printStackTrace();
            }catch (InvalidPhoneException im) {
                im.printStackTrace();
            }catch (InvalidPasswordException ip) {
                ip.printStackTrace();
            }
        };
        validator.validate(firstName, lastName, email, mobile, password);

    }

    /**
     * Tests all negative cases
     * 
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

        ValidationInterface validator = (fName, lName, mail, phone, pword) -> {
            try {
                Assert.assertTrue(userReg.validateFirstName(fName));
                Assert.assertTrue(userReg.validateLastName(lName));
                Assert.assertTrue(userReg.validateEmail(mail));
                Assert.assertTrue(userReg.validatePhone(phone));
                Assert.assertTrue(userReg.validatePassword(pword));
            } catch (InvalidFirstNameException ifn) {
                ifn.printStackTrace();
            }catch (InvalidLastNameException iln) {
                iln.printStackTrace();
            }catch (InvalidEmailException ie) {
                ie.printStackTrace();
            }catch (InvalidPhoneException im) {
                im.printStackTrace();
            }catch (InvalidPasswordException ip) {
                ip.printStackTrace();
            }
        };
        validator.validate(firstName, lastName, email, mobile, password);

    }
}

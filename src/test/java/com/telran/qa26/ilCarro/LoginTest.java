package com.telran.qa26.ilCarro;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() {
        /*ctr shift. if user logeed in , logout /*/
        if (isUserLoggedIn()) {
            clickLogOutButtonOnHeader();
        }
    }

    @Test
    public void testLogin() throws InterruptedException {
        clickLoginButton();
        fillLoginForm("hi1608978430338@gmail.com", "Ab1234567");
        pause(2000);
        clickYallaButton();
        Assert.assertTrue(isUserLoggedIn());
    }

}

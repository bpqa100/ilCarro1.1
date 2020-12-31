package com.telran.qa26.ilCarro.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() {
        /*ctr shift. if user logeed in , logout /*/
        if (app.getUserHelper().isUserLoggedIn()) {
            app.getUserHelper().clickLogOutButtonOnHeader();
        }
    }

    @Test
    public void testLogin() throws InterruptedException {
        app.getUserHelper().clickLoginButton();
        app.getUserHelper().fillLoginForm("hi1608978430338@gmail.com", "Ab1234567");
        app.getUserHelper().pause(2000);
        app.getUserHelper().clickYallaButton();
        Assert.assertTrue(app.getUserHelper().isUserLoggedIn());
    }

}

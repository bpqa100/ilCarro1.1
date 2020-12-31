package com.telran.qa26.ilCarro.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOutTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        if (!app.getUserHelper().isUserLoggedIn()) {
            app.getUserHelper().login();

        }
    }

    @Test
    public void logOutTest() throws InterruptedException {
        app.getUserHelper().clickLogOutButtonOnHeader();
    }

}



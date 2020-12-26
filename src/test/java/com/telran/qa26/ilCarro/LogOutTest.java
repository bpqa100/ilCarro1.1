package com.telran.qa26.ilCarro;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOutTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        if (!isUserLoggedIn()) {
            login();

        }
    }

    @Test
    public void logOutTest() throws InterruptedException {
        clickLogOutButtonOnHeader();
    }

}



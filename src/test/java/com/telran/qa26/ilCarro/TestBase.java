package com.telran.qa26.ilCarro;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected AppManager app = new AppManager();

    @BeforeClass
    public void setUp() {
        app.start();
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        app.stop();
    }

}

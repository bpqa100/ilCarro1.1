package com.telran.qa26.ilCarro.tests;

import com.telran.qa26.ilCarro.application.AppManager;
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

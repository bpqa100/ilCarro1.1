package com.telran.qa26.ilCarro.tests;

import com.telran.qa26.ilCarro.application.AppManager;
import org.testng.annotations.*;

public class TestBase {

    protected static AppManager app = new AppManager();

    @BeforeSuite
    public void setUp() {
        app.start();
    }

    @AfterSuite//(enabled = false)
    public void tearDown() {
        app.stop();
    }

}

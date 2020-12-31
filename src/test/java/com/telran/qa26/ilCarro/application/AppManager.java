package com.telran.qa26.ilCarro.application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class AppManager {
    WebDriver wd;
    UserHelper userHelper;
    CarHelper carHelper;

    public void start() {
        wd = new FirefoxDriver();
        //wd = new ChromeDriver();
        wd.navigate().to("https://ilcarro-dev-v1.firebaseapp.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        userHelper = new UserHelper(wd);
        carHelper = new CarHelper(wd);

    }

    public void stop() {
        wd.quit();

    }

    public CarHelper getCarHelper() {
        return carHelper;
    }

    public UserHelper getUserHelper() {
        return userHelper;
    }
}

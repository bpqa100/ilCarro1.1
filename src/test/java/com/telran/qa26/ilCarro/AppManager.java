package com.telran.qa26.ilCarro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class AppManager {
    WebDriver wd;
    UserHelper userHelper;

        protected void start() {
            wd = new FirefoxDriver();
        //wd = new ChromeDriver();
        wd.navigate().to("https://ilcarro-dev-v1.firebaseapp.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        userHelper = new UserHelper(wd);

    }

    protected void stop() {
        wd.quit();

    }

    public UserHelper getUserHelper() {
        return userHelper;
    }
}

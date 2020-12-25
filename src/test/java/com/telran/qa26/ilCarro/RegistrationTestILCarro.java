package com.telran.qa26.ilCarro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTestILCarro {

    WebDriver wd;

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.navigate().to("https://ilcarro-dev-v1.firebaseapp.com/");
    }

    @Test
    public void registrationTest() throws InterruptedException {
        openRegForm();
        String email = "hi" + System.currentTimeMillis() + "@gmail.com";
        fillRefistrionForm("Alexey", "Ab",email, "Ab1234567");
        selectCheckBox();
        pause(2000);
        clickYallaButton();
        pause(3000);
        Assert.assertFalse(isRegistrationFormPresent());

       // wd.findElement(By.cssSelector("[href=\"/signup\"]")).click();


        // wd.findElement(By.xpath("//*[@id=\"first_name\"]")).click();
        // wd.findElement(By.id("first_name")).clear();
        // wd.findElement(By.id("first_name")).sendKeys("Alexey");


        //wd.findElement(By.cssSelector("[name=\"second_name\"]")).click();
        // wd.findElement(By.xpath("//*[@id='second_name']")).clear();
        //wd.findElement(By.cssSelector("[name=\"second_name\"]")).sendKeys("Ab");


        //wd.findElement(By.xpath("//*[@type='email']")).click();
        //wd.findElement(By.cssSelector("[name=\"email\"]")).clear();
        // wd.findElement(By.cssSelector("[name=\"email\"]")).sendKeys(email);


        // wd.findElement(By.cssSelector("[id=\"password\"]")).click();
        // wd.findElement(By.cssSelector("[id=\"password\"]")).clear();
        //wd.findElement(By.cssSelector("[id=\"password\"]")).sendKeys("Ab1234567");

        //wd.findElement(By.cssSelector("[type=\"checkbox\"]")).click();


        //wd.findElement(By.cssSelector("[type=\"submit\"]")).click();

    }

    public void clickYallaButton() {
        click(By.cssSelector("[type=\"submit\"]"));
    }

    public boolean isRegistrationFormPresent() {
        return wd.findElements(By.xpath("//h2[contains(.,'Registration')]")).size() > 0;
    }

    public void pause(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    public void selectCheckBox() {
        click(By.cssSelector("[type=\"checkbox\"]"));
    }

    public void fillRefistrionForm(String fName, String lName, String email, String password) {
        type(By.xpath("//*[@id=\"first_name\"]"), fName);
        type(By.cssSelector("[name=\"second_name\"]"), lName);
        System.out.println("email is :" + email);
        type(By.cssSelector("[name=\"email\"]"), email);
        type(By.cssSelector("[id=\"password\"]"), password);
    }

    public void openRegForm() {
        click(By.cssSelector("[href=\"/signup\"]"));
    }

    public void type(By locator, String text) {
        //wd.findElement(locator).click();
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        wd.quit();
    }
}

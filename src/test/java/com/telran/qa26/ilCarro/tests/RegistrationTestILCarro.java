package com.telran.qa26.ilCarro.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTestILCarro extends TestBase {

    @Test
    public void registrationTest() throws InterruptedException {
        app.getUserHelper().openRegForm();
        String email = "hi" + System.currentTimeMillis() + "@gmail.com";
        app.getUserHelper().fillRefistrionForm("Alexey", "Ab", email, "Ab1234567");
        app.getUserHelper().selectCheckBox();
        app.getUserHelper().pause(2000);
        app.getUserHelper().clickYallaButton();
        app.getUserHelper().pause(3000);
        Assert.assertFalse(app.getUserHelper().isRegistrationFormPresent());
    }

    @Test
    public void registrationTestNegative1() throws InterruptedException {     //empty fName
        app.getUserHelper().openRegForm();
        String email = "hi" + System.currentTimeMillis() + "@gmail.com";
        app.getUserHelper().fillRefistrionForm("", "Ab", email, "Ab1234567");
        app.getUserHelper().selectCheckBox();
        app.getUserHelper().pause(2000);
        app.getUserHelper().clickYallaButton();
        app.getUserHelper().pause(3000);
        Assert.assertTrue(app.getUserHelper().isRegistrationFormPresent());
    }

    @Test
    public void registrationTestNegative2() throws InterruptedException {  //not valid email
        app.getUserHelper().openRegForm();
        String email = "hi" + System.currentTimeMillis() + "gmail.com";
        app.getUserHelper().fillRefistrionForm("Alexey", "Ab", email, "Ab1234567");
        app.getUserHelper().selectCheckBox();
        app.getUserHelper().pause(2000);
        app.getUserHelper().clickYallaButton();
        app.getUserHelper().pause(3000);
        Assert.assertTrue(app.getUserHelper().isRegistrationFormPresent());
    }

    @Test
    public void registrationTestNegative3() throws InterruptedException {     //empty password
        app.getUserHelper().openRegForm();
        String email = "hi" + System.currentTimeMillis() + "@gmail.com";
        app.getUserHelper().fillRefistrionForm("Alexey", "Ab", email, "");
        app.getUserHelper().selectCheckBox();
        app.getUserHelper().pause(2000);
        app.getUserHelper().clickYallaButton();
        app.getUserHelper().pause(3000);
        Assert.assertTrue(app.getUserHelper().isRegistrationFormPresent());
    }

    @Test
    public void registrationTestNegative4() throws InterruptedException {     //space password
        app.getUserHelper().openRegForm();
        String email = "hi" + System.currentTimeMillis() + "@gmail.com";
        app.getUserHelper().fillRefistrionForm("Alexey", "Ab", email, "    ");
        app.getUserHelper().selectCheckBox();
        app.getUserHelper().pause(2000);
        app.getUserHelper().clickYallaButton();
        app.getUserHelper().pause(3000);
        Assert.assertTrue(app.getUserHelper().isRegistrationFormPresent());
    }


}

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





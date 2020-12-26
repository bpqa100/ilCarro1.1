package com.telran.qa26.ilCarro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTestILCarro extends TestBase {

    @Test
    public void registrationTest() throws InterruptedException {
        openRegForm();
        String email = "hi" + System.currentTimeMillis() + "@gmail.com";
        fillRefistrionForm("Alexey", "Ab", email, "Ab1234567");
        selectCheckBox();
        pause(2000);
        clickYallaButton();
        pause(3000);
        Assert.assertFalse(isRegistrationFormPresent());
    }

    @Test
    public void registrationTestNegative1() throws InterruptedException {     //empty fName
        openRegForm();
        String email = "hi" + System.currentTimeMillis() + "@gmail.com";
        fillRefistrionForm("", "Ab", email, "Ab1234567");
        selectCheckBox();
        pause(2000);
        clickYallaButton();
        pause(3000);
        Assert.assertTrue(isRegistrationFormPresent());
    }

    @Test
    public void registrationTestNegative2() throws InterruptedException {  //not valid email
        openRegForm();
        String email = "hi" + System.currentTimeMillis() + "gmail.com";
        fillRefistrionForm("Alexey", "Ab", email, "Ab1234567");
        selectCheckBox();
        pause(2000);
        clickYallaButton();
        pause(3000);
        Assert.assertTrue(isRegistrationFormPresent());
    }

    @Test
    public void registrationTestNegative3() throws InterruptedException {     //empty password
        openRegForm();
        String email = "hi" + System.currentTimeMillis() + "@gmail.com";
        fillRefistrionForm("Alexey", "Ab", email, "");
        selectCheckBox();
        pause(2000);
        clickYallaButton();
        pause(3000);
        Assert.assertTrue(isRegistrationFormPresent());
    }

    @Test
    public void registrationTestNegative4() throws InterruptedException {     //space password
        openRegForm();
        String email = "hi" + System.currentTimeMillis() + "@gmail.com";
        fillRefistrionForm("Alexey", "Ab", email, "    ");
        selectCheckBox();
        pause(2000);
        clickYallaButton();
        pause(3000);
        Assert.assertTrue(isRegistrationFormPresent());
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





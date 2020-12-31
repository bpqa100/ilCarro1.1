package com.telran.qa26.ilCarro.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase {

    public UserHelper(WebDriver wd) {
        super(wd);
    }
    public void login() throws InterruptedException {
        clickByCss("[href=\"/login\"]");
        fillLoginForm("hi1608978430338@gmail.com", "Ab1234567");
        pause(2000);
        clickByCss("[type=submit]");
    }

        public boolean isRegistrationFormPresent() {
        return isElementPresent(By.xpath("//h2[contains(.,'Registration')]"));
    }

    public void clickLoginButton() {
        clickByCss("[href=\"/login\"]");
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

    public void fillLoginForm(String email, String password) {
        typeByCss("[name=email]", email);
        typeByCss("[name=password]", password);
    }

    public void clickLogOutButtonOnHeader() {
        clickByXpath("//a[contains(.,'logOut')]");
    }

    public boolean isUserLoggedIn() {
        return isElementPresent(By.xpath("//a[contains(.,'logOut')]"));
    }
}

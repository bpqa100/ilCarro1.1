package com.telran.qa26.ilCarro.application;

import com.telran.qa26.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase {

    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void login() throws InterruptedException {
        clickByCss("[href=\"/login\"]");
        fillLoginForm(new User()
                .withtEmail("hi1608978430338@gmail.com")
                .withPassword("Ab1234567"));
        pause(3000);
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

    public void fillRefistrionForm(User user) {
        type(By.xpath("//*[@id=\"first_name\"]"), user.getfName());
        type(By.cssSelector("[name=\"second_name\"]"), user.getlName());

        System.out.println("email is :" + user.getEmail());
        type(By.cssSelector("[name=\"email\"]"), user.getEmail());
        type(By.cssSelector("[id=\"password\"]"), user.getPassword());
    }

    public void openRegForm() {
        click(By.cssSelector("[href=\"/signup\"]"));
    }

    public void fillLoginForm(User user) {
        typeByCss("[name=email]", user.getEmail());
        typeByCss("[name=password]", user.getPassword());
    }

    public void clickLogOutButtonOnHeader() {
        clickByXpath("//a[contains(.,'logOut')]");

    }

    public boolean isUserLoggedIn() {
        return isElementPresent(By.xpath("//a[contains(.,'logOut')]"));
    }
}

package com.telran.qa26.ilCarro.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarHelper extends HelperBase {
    public CarHelper(WebDriver wd) {
        super(wd);
    }

    public void initAddNewCar() {
        click(By.cssSelector("header [href=\"/car\"]"));
    }

    public boolean isCarCreationFormPresent() {
        return isElementPresent(By.cssSelector("h3"));
    }

    public void fillCarForm(Car car) {
        type(By.cssSelector("[name=\"country\"]"), car.getLocation());
        type(By.cssSelector("[name=\"address\"]"), car.getAddress());
        type(By.cssSelector("[name=\"distance_included\"]"), car.getDistanceInclude());
        type(By.cssSelector("[name=\"serial_number\"]"), car.getSn());
        type(By.cssSelector("[name=\"make\"]"), car.getBrand());
        type(By.cssSelector("[name=\"model\"]"), car.getModel());
        type(By.cssSelector("[name=\"year\"]"), car.getYear());
        type(By.cssSelector("[name=\"engine\"]"), car.getEngine());
        type(By.xpath("//input[@placeholder='Fuel Consumption']"), car.getFuel_consumption());
        type(By.xpath("//input[@placeholder='Fuel']"), car.getFuel());
        type(By.xpath("//input[@placeholder='Transmition']"), car.getTransmission());
        type(By.xpath("//input[@placeholder='WD']"), car.getwD());


    }
}

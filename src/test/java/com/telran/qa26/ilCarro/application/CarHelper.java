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

    public void fillCarForm(String location,String address, String distanceInclude,String sn, String brand ,String model, String year ,String engine ,String fuel_consumption,String fuel ,String transmission , String wD) {
        type(By.cssSelector("[name=\"country\"]"), location);
        type(By.cssSelector("[name=\"address\"]"),address);
        type(By.cssSelector("[name=\"distance_included\"]"),distanceInclude);
        type(By.cssSelector("[name=\"serial_number\"]"),sn);
        type(By.cssSelector("[name=\"make\"]"), brand);
        type(By.cssSelector("[name=\"model\"]"), model);
        type(By.cssSelector("[name=\"year\"]"), year);
        type(By.cssSelector("[name=\"engine\"]"),engine);
        type(By.xpath("//input[@placeholder='Fuel Consumption']"), fuel_consumption);
        type(By.xpath("//input[@placeholder='Fuel']"),fuel);
        type(By.xpath("//input[@placeholder='Transmition']"), transmission);
        type(By.xpath("//input[@placeholder='WD']") ,wD);


    }
}

package com.telran.qa26.ilCarro.tests;

import com.telran.qa26.ilCarro.application.Car;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CarCreationTest extends TestBase {


    @Test (enabled = false)
    public void testCarCreation() {
        app.getCarHelper().initAddNewCar();
        Assert.assertTrue(app.getCarHelper().isCarCreationFormPresent());
        app.getCarHelper().fillCarForm(new Car().withLocation("Israel")
                .withAddress("Rehovot")
                .withDistanceInclude("3500")
                .withSn("123 45 456")
                .withBrand("Mazda")
                .withModel("Demio")
                .withYear("2008")
                .withEngine("2000")
                .withFuel_consumption("15")
                .withFuel("petrol")
                .withTransmission("mechanics")
                .withwD("4WD"));

    }

}

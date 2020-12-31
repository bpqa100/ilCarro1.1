package com.telran.qa26.ilCarro.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CarCreationTest extends TestBase    {


    @Test
    public void testCarCreation(){
        app.getCarHelper().initAddNewCar();
        Assert.assertTrue(app.getCarHelper().isCarCreationFormPresent());
        app.getCarHelper().fillCarForm("Israel","Rehovot","3500","123 45 456","Mazda","Demio","2008", "2000", "15", "petrol","mechanics", "4WD");

    }

}

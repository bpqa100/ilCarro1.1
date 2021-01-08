package com.telran.qa26.ilCarro.application;

public class Car {
    private String location;
    private String address;
    private String distanceInclude;
    private String sn;
    private String brand;
    private String model;
    private String year;
    private String engine;
    private String fuel_consumption;
    private String fuel;
    private String transmission;
    private String wD;

    public Car withLocation(String location) {
        this.location = location;
        return this;
    }

    public Car withAddress(String address) {
        this.address = address;
        return this;

    }

    public Car withDistanceInclude(String distanceInclude) {
        this.distanceInclude = distanceInclude;
        return this;

    }

    public Car withSn(String sn) {
        this.sn = sn;
        return this;

    }

    public Car withBrand(String brand) {
        this.brand = brand;
        return this;

    }

    public Car withModel(String model) {
        this.model = model;
        return this;

    }

    public Car withYear(String year) {
        this.year = year;
        return this;

    }

    public Car withEngine(String engine) {
        this.engine = engine;
        return this;

    }

    public Car withFuel_consumption(String fuel_consumption) {
        this.fuel_consumption = fuel_consumption;
        return this;

    }

    public Car withFuel(String fuel) {
        this.fuel = fuel;
        return this;

    }

    public Car withTransmission(String transmission) {
        this.transmission = transmission;
        return this;

    }

    public Car withwD(String wD) {
        this.wD = wD;
        return this;

    }

    public String getLocation() {
        return location;
    }

    public String getAddress() {
        return address;
    }

    public String getDistanceInclude() {
        return distanceInclude;
    }

    public String getSn() {
        return sn;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getEngine() {
        return engine;
    }

    public String getFuel_consumption() {
        return fuel_consumption;
    }

    public String getFuel() {
        return fuel;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getwD() {
        return wD;
    }
}

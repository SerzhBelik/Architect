package com.company.drivers;

public class DriverBuilder {
    private final Driver driver;

    public DriverBuilder(){
        driver = new Driver();
    }

    public DriverBuilder setLastName(String lastName){
        driver.setLastName(lastName);
        return this;
    }

    public DriverBuilder setFirstName(String firstName){
        driver.setFirstName(firstName);
        return this;
    }

    public DriverBuilder setRegion(String region){
        driver.setRegion(region);
        return this;
    }

    public DriverBuilder setLicenseNumber(String licenseNumber){
        driver.setLicenseNumber(licenseNumber);
        return this;
    }

    public DriverBuilder setRegionRate(double regionRate){
        driver.setRegionRate(regionRate);
        return this;
    }

    public Driver build(){
        return driver;
    }

    }

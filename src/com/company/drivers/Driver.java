package com.company.drivers;

import java.util.List;

public class Driver {
    private String lastName;
    private String firstName;
    private String region;
    private String licenseNumber;
    private double regionRate;
//    private List<Driver> drivers;


    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getRegion() {
        return region;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public double getRegionRate() {
        return regionRate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setRegionRate(double regionRate) {
        this.regionRate = regionRate;
    }
}

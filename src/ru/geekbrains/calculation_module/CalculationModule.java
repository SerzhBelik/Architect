package ru.geekbrains.calculation_module;

import com.company.Car;
import com.company.drivers.Driver;

import java.util.List;

public class CalculationModule {
    private List<Driver> drivers;
    private Car car;
    private double TotalPrice;

    public CalculationModule(List<Driver> drivers, Car car){
        this.drivers = drivers;
        this.car = car;
    }

    public double getPayment(){
        double currentPrice = 0;
        for (Driver driver : drivers){
            if (currentPrice < getPersonalPrice(driver)) currentPrice = getPersonalPrice(driver);

        }
        return currentPrice;
    }

    private double getPersonalPrice(Driver driver) {
        return 0;
    }
}

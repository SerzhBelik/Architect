package ru.geekbrains.calculation_module;

import com.company.Car;
import com.company.drivers.Driver;

import java.util.List;
// данный класс относится к серверной части, данные для расчета получает от клиента, не достающие данные берет в базе
public class CalculationModule {
    private List<Driver> drivers; // эти данные должны быть получены от клиентской части
    private Car car;// эти данные должны быть получены от клиентской части
    private double TotalPrice;
    private double baseRate;
    private double powerRate;

    public CalculationModule(List<Driver> drivers, Car car){
        this.drivers = drivers;
        this.car = car;
        this.baseRate = getBaseRate();
        this.TotalPrice = getPayment();
        this.powerRate = new PowerRate().getPowerRate(car.getPowerClass());
    }

    private double getBaseRate() {
        // запрос базовой ставки из БД
        return 4736;
    }

    public double getPayment(){
        double currentPrice = 0;
        for (Driver driver : drivers){
            if (currentPrice < getPersonalPrice(driver)) currentPrice = getPersonalPrice(driver);

        }
        return currentPrice;
    }

    private double getPersonalPrice(Driver driver) {
        return baseRate*driver.getRegionRate()*powerRate;
    }
}

package ru.geekbrains.calculation_module;

import java.util.HashMap;

public class PowerRate implements PowerRateService {

    private final HashMap<Integer, Double> rates = new HashMap<>();
    private final CurrentPowerRateService currentPowerRateService  = new CurrentPowerRateService();



    @Override
    public double getPowerRate(int powerClass) {
        if (rates.containsKey(powerClass)) {
            return rates.get(powerClass);
        } else {
            Double rate = currentPowerRateService.getPowerRate(powerClass);
            rates.put(powerClass, rate);
            return rate;
        }

    }
}

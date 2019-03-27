package com.company;

public class Car {

    private int powerClass;
    private int power;

    public Car(int power){
        this.power = power;
        this.powerClass = calcPowerClass();

    }

    private int calcPowerClass() {
        if (power <= 50) return  0;
        if (power <= 70) return 1;
        if (power <= 100) return 2;
        if (power <= 120) return 3;
        if (power <= 150) return 4;
        return 5;
    }

    public int getPowerClass() {
        return powerClass;
    }
}

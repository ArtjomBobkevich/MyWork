package com.company;

public class RacingCar extends Car {

    public RacingCar(String mark, String model, int age, String typeFuel, int mass) {
        super(mark, model, age, typeFuel, mass);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return "Гоночный авто ";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
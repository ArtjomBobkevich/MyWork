package com.company;

public class CivicCar extends Car {

    public CivicCar(String mark, String model, int age, String typeFuel, int mass) {
        super(mark, model, age, typeFuel, mass);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return "Легковушка обыкновенная "+getMark();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
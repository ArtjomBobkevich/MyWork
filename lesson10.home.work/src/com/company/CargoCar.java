package com.company;

public class CargoCar extends Car {

    public CargoCar(String mark, String model, int age, String typeFuel, int mass) {
        super(mark, model, age, typeFuel, mass);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return getMark() + " " + getModel() + " " + getType() + " " + getAge() + " года с массой: " + getMass();
    }
}
package com.company;

public class CargoCar extends Car {

    public CargoCar(Mark mark, Model model, int age, TypeFuel typeFuel, int mass) {
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
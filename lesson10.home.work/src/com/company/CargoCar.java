package com.company;

import java.util.Objects;

public class CargoCar extends Car {

    public CargoCar(Mark mark, Model model, int age, TypeFuel typeFuel, int mass) {
        super(mark, model, age, typeFuel, mass);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getAge() == car.getAge() &&
                getMass() == car.getMass() &&
                Objects.equals(getMark(), car.getMark()) &&
                Objects.equals(getModel(), car.getModel()) &&
                Objects.equals(getType(), car.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMark(), getModel(), getAge(), getType(), getMass());
    }

    @Override
    public String toString() {
        return getMark() + " " + getModel() + " " + getType() + " " + getAge() + " года с массой: " + getMass();
    }
}
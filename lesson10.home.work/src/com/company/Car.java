package com.company;

import java.util.Objects;

public abstract class Car {

    private String mark;
    private String model;
    private int age;
    private TypeFuel typeFuel;
    private int mass;

    public Car(String mark, String model, int age, TypeFuel typeFuel, int mass) {
        this.mark = mark;
        this.model = model;
        this.typeFuel = typeFuel;
        this.age = age;
        this.mass = mass;
    }

    enum TypeFuel {
        petrol,
        diesel
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Car)) return false;
        Car car = (Car) o;
        return age == car.age &&
                mass == car.mass &&
                Objects.equals(mark, car.mark) &&
                Objects.equals(model, car.model) &&
                Objects.equals(typeFuel, car.typeFuel);
    }

    @Override
    public int hashCode() {

        return Objects.hash(mark, model, age, typeFuel, mass);
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }

    public TypeFuel getType() {
        return typeFuel;
    }

    public int getMass() {
        return mass;
    }

}
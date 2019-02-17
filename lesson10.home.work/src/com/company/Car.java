package com.company;

import java.util.Objects;

public abstract class Car {

    private String mark;
    private String model;
    private int age;
    private String typeFuel;
    private int mass;

    public Car (String mark,String model,int age,String typeFuel,int mass){
        this.mark=mark;
        this.model=model;
        this.typeFuel=typeFuel;
        this.age=age;
        this.mass=mass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return this.mark == car.mark;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark);
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

    public String getType() {
        return typeFuel;
    }

    public int getMass() {
        return mass;
    }
}
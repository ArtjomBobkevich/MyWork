package com.company;


import java.util.Objects;

public abstract class Car {

    private Mark mark;
    private Model model;
    private int age;
    private TypeFuel typeFuel;
    private int mass;

    public Car(Mark mark, Model model, int age, TypeFuel typeFuel, int mass) {
        this.mark = mark;
        this.model = model;
        this.typeFuel = typeFuel;
        this.age = age;
        this.mass = mass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return age == car.age &&
                mass == car.mass &&
                mark == car.mark &&
                model == car.model &&
                typeFuel == car.typeFuel;
    }

    @Override
    public int hashCode() {

        return Objects.hash(mark, model, age, typeFuel, mass);
    }

    enum TypeFuel {
        petrol,
        diesel
    }

    enum Mark {
        toyota,
        audi,
        nissan,
        tank
    }

    enum Model {
        GTR,
        supra,
        Rav,
        R8,
        T85
    }

    public Mark getMark() {
        return mark;
    }

    public Model getModel() {
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
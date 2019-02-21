package com.company;

import java.util.*;

public class Garage {

    public static void main(String[] args) {
        Car car1 = new RacingCar(Car.Mark.nissan, Car.Model.GTR, 2002, Car.TypeFuel.petrol, 1300);
        Car car2 = new RacingCar(Car.Mark.toyota, Car.Model.supra, 2010, Car.TypeFuel.petrol, 1110);
        Car car3 = new RacingCar(Car.Mark.toyota, Car.Model.Rav, 2010, Car.TypeFuel.petrol, 1110);
        Car car4 = new RacingCar(Car.Mark.audi, Car.Model.R8, 1993, Car.TypeFuel.petrol, 1500);
        Car car12 = new CargoCar(Car.Mark.toyota, Car.Model.supra, 2010, Car.TypeFuel.petrol, 1110);
        Car car15 = new MilitaryCar(Car.Mark.tank, Car.Model.T85, 1972, Car.TypeFuel.diesel, 40000);
        Car car16 = new MilitaryCar(Car.Mark.tank, Car.Model.T85, 1972, Car.TypeFuel.diesel, 40000);


        Map<Car, Integer> allCarInGarage = new HashMap<>();

        System.out.println("В гараже находятся авто:");
        System.out.println(allCarInGarage);
        System.out.println("В гараже припарковался авто: ");
        parking(car1, allCarInGarage);
        System.out.println(allCarInGarage);
        System.out.println("В гараже припарковался авто: ");
        parking(car2, allCarInGarage);
        System.out.println(allCarInGarage);
        System.out.println("В гараже припарковался авто: ");
        parking(car3, allCarInGarage);
        System.out.println(allCarInGarage);
        System.out.println("В гараже припарковался авто: ");
        parking(car4, allCarInGarage);
        System.out.println(allCarInGarage);
        System.out.println("В гараже припарковался авто: ");
        parking(car15, allCarInGarage);
        System.out.println(allCarInGarage);
        System.out.println("В гараже припарковался авто: ");
        parking(car16, allCarInGarage);
        System.out.println(allCarInGarage);
        System.out.println("В гараже припарковался авто: ");
        parking(car12, allCarInGarage);
        System.out.println(allCarInGarage);
        System.out.println("Из гаража выехало авто: ");
        departureCar(car4, allCarInGarage);
        System.out.println(allCarInGarage);
        System.out.println("Из гаража выехало авто: ");
        departureCar(car2, allCarInGarage);
        System.out.println(allCarInGarage);
        sortCar(car2,allCarInGarage);

    }

    public static void parking(Car x, Map<Car, Integer> carMap) {
        int oldValue;
        int value = 1;
        if (!carMap.containsKey(x)) {
            carMap.put(x, value);
        } else {
            oldValue = carMap.get(x);
            carMap.put(x, oldValue + value);
        }
    }

    public static void departureCar(Car x, Map<Car, Integer> carMap) {
        int oldValue = carMap.get(x);
        if (carMap.containsKey(x)) {
            carMap.put(x, oldValue - 1);
        }
        if (carMap.containsValue(0)) {
            carMap.remove(x);
        }
    }

    public static void sortCar(Car x, Map<Car, Integer> carMap) {
        int valueMark = 0;
        int valueModel = 0;
        int valuefuelType = 0;
        int valueAge = 0;
        int valueMass = 0;
        for (Map.Entry<Car, Integer> entry : carMap.entrySet()) {
            if (entry.getKey().getMark().equals(x.getMark())) {
                valueMark++;
            }
            if (entry.getKey().getModel().equals(x.getModel())) {
                valueModel++;
            }
            if (entry.getKey().getType().equals(x.getType())) {
                valuefuelType++;
            }
            if (entry.getKey().getAge() == (x.getAge())) {
                valueAge++;
            }
            if (entry.getKey().getMass() == (x.getMass())) {
                valueMass++;
            }
        }
        System.out.println("Авто такой марки: "+valueMark);
        System.out.println("Авто такой модели: "+valueModel);
        System.out.println("Авто такого типа топлива: "+valuefuelType);
        System.out.println("Авто такого года: "+valueAge);
        System.out.println("Авто такой массы: "+valueMass);
    }
}




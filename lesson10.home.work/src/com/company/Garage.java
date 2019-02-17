package com.company;

import java.util.*;

public class Garage {
    public static void main(String[] args) {
        Car car1 = new RacingCar("nissan", "GT-R", 10, "petrol", 1300);
        Car car2 = new RacingCar("toyota", "supra", 7, "petrol", 1110);
        Car car3 = new RacingCar("toyota", "mark2", 19, "petrol", 1760);
        Car car4 = new RacingCar("audi", "R-8", 3, "petrol", 1500);
        Car car12 = new CargoCar("toyota", "tundra", 17, "petrol", 4000);
        Car car15 = new MilitaryCar("tank", "abrams", 8, "diesel", 45000);
        Car car16 = new MilitaryCar("tank", "T-85", 35, "diesel", 40000);


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
            carMap.put(x, oldValue-1);
        }if (carMap.containsValue(0)){
            carMap.remove(x);
        }
    }

    public static void sortCar (Car x, Map<Car, Integer> carMap){
        int oldValue = carMap.get(x);
                oldValue++;
        System.out.println("Таких вида авто в гараже:"+oldValue);
    }
}



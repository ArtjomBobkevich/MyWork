package com.company;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    public static void main(String[] args) {
        Car car1 = new RacingCar("nissan", "GT-R", 10, "petrol", 1300);
        Car car2 = new RacingCar("toyota", "supra", 7, "petrol", 1110);
        Car car3 = new RacingCar("audi", "R-8", 3, "petrol", 1500);
        Car car4 = new RacingCar("BMW", "850", 1, "petrol", 1700);
        Car car5 = new CivicCar("honda", "civic", 15, "petrol", 1600);
        Car car6 = new CivicCar("audi", "a4", 14, "diesel", 1800);
        Car car7 = new CivicCar("mercedes", "e320", 8, "diesel", 2300);
        Car car8 = new CivicCar("mazda", "6", 7, "diesel", 1900);
        Car car9 = new CargoCar("mercedes", "sprinter", 2, "diesel", 3500);
        Car car10 = new CargoCar("opel", "vivaro", 8, "diesel", 2700);
        Car car11 = new CargoCar("toyota", "tundra", 17, "petrol", 4000);
        Car car12 = new MilitaryCar("toyota", "hilux", 11, "petrol", 2400);
        Car car13 = new MilitaryCar("dodge", "ram2000", 4, "petrol", 4500);
        Car car14 = new MilitaryCar("tank", "abrams", 8, "diesel", 45000);
        Car car15 = new MilitaryCar("tank", "T-85", 35, "diesel", 40000);

        Map<Car, String> allCarInGarage = new HashMap<>();
        allCarInGarage.put(car1, car1.getMark());

        System.out.println("В гараже находятся авто:");
        System.out.println(allCarInGarage);
        System.out.println("В гараже припарковался авто: ");
        Parking(car2,allCarInGarage);
        System.out.println(allCarInGarage);
        System.out.println("В гараже припарковался авто: ");
        Parking(car3,allCarInGarage);
        System.out.println(allCarInGarage);
        System.out.println("В гараже припарковался авто: ");
        Parking(car14, allCarInGarage);
        System.out.println(allCarInGarage);
        System.out.println("Из гаража выехало авто: ");
        departureCar(car3,allCarInGarage);
        System.out.println(allCarInGarage);
    }

    public static void Parking(Car x, Map<Car, String> carMap) {
        carMap.put(x, x.getMark());
    }

    public static void departureCar (Car x, Map<Car, String> сarMap) {
        сarMap.remove(x, x.getMark());
    }

//    public static int amountCar (Map<Car, String> carMap){
//        int amount=1;
//        for (int j=0;j<carMap.size();j++){
//
//        }
//    for (int i=0;i<carMap.size();i++){
//        for (int i=0; i<size;i++) {
//            if (map.containsKey(subStr[i])) {
//                value=map.get(subStr[i]);
//                map.put(subStr[i], contain[i]+value);
//            } else {
//                carMap.put(subStr[i], amount);
//            }
//        }
//    }
    }



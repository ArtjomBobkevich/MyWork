package com.company;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    public static void main(String[] args) {
        Car racingCar2 = new RacingCar("nissan", "GT-R", 10, "petrol", 1300);
        RacingCar racingCar = new RacingCar("toyota", "supra", 7, "petrol", 1110);
        Map<Car, RacingCar> map = new HashMap<>();
        map.put(racingCar2,racingCar);
        RacingCar racingCar3 = map.get(racingCar2);

        System.out.println(racingCar3.getMark());

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
//        public static void Parking (Map<Car, Car> map){
//            RacingCar racingCar3=map.get()
//        }
//    }


//RacingCar racingCar1 = new RacingCar("nissan", "GT-R", 10, "petrol", 1300);
//        RacingCar racingCar2 = new RacingCar("toyota", "supra", 7, "petrol", 1110);
//        RacingCar racingCar3 = new RacingCar("audi", "R-8", 3, "petrol", 1500);
//        RacingCar racingCar4 = new RacingCar("BMW", "850", 1, "petrol", 1700);
//        CivicCar civicCar1 = new CivicCar("honda", "civic", 15, "petrol", 1600);
//        CivicCar civicCar2 = new CivicCar("audi", "a4", 14, "diesel", 1800);
//        CivicCar civicCar3 = new CivicCar("mercedes", "e320", 8, "diesel", 2300);
//        CivicCar civicCar4 = new CivicCar("mazda", "6", 7, "diesel", 1900);
//        CargoCar cargoCar1 = new CargoCar("mercedes", "sprinter", 2, "diesel", 3500);
//        CargoCar cargoCar2 = new CargoCar("opel", "vivaro", 8, "diesel", 2700);
//        CargoCar cargoCar3 = new CargoCar("toyota", "tundra", 17, "petrol", 4000);
//        MilitaryCar militaryCar1 = new MilitaryCar("toyota", "hilux", 11, "petrol", 2400);
//        MilitaryCar militaryCar2 = new MilitaryCar("dodge", "ram2000", 4, "petrol", 4500);
//        MilitaryCar militaryCar3 = new MilitaryCar("tank", "abrams", 8, "diesel", 45000);
//        MilitaryCar militaryCar4 = new MilitaryCar("tank", "T-85", 35, "diesel", 40000);
//
//        Map<Car, Car> map = new HashMap<>();
//        map.put(racingCar1, new RacingCar("nissan", "GT-R", 10, "petrol", 1300));
//        map.put(racingCar2, new RacingCar("toyota", "supra", 7, "petrol", 1110));
//        map.put(racingCar3, new RacingCar("audi", "R-8", 3, "petrol", 1500));
//        map.put(racingCar4, new RacingCar("BMW", "850", 1, "petrol", 1700));
//        map.put(civicCar1, new CivicCar("honda", "civic", 15, "petrol", 1600));
//        map.put(civicCar2, new CivicCar("audi", "a4", 14, "diesel", 1800));
//        map.put(civicCar3, new CivicCar("mercedes", "e320", 8, "diesel", 2300));
//        map.put(civicCar4, new CivicCar("mazda", "6", 7, "diesel", 1900));
//        map.put(cargoCar1, new CargoCar("mercedes", "sprinter", 2, "diesel", 3500));
//        map.put(cargoCar2, new CargoCar("opel", "vivaro", 8, "diesel", 2700));
//        map.put(cargoCar3, new CargoCar("toyota", "tundra", 17, "petrol", 4000));
//        map.put(militaryCar1, new MilitaryCar("toyota", "hilux", 11, "petrol", 2400));
//        map.put(militaryCar2, new MilitaryCar("dodge", "ram2000", 4, "petrol", 4500));
//        map.put(militaryCar3, new MilitaryCar("tank", "abrams", 8, "diesel", 45000));
//        map.put(militaryCar4, new MilitaryCar("tank", "T-85", 35, "diesel", 40000));
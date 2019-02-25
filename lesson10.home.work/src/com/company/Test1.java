package com.company;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

    public static void main(String[] args) {



        SashaGarage garage=new SashaGarage();

        garage.parkIn(new RacingCar(Car.Mark.nissan, Car.Model.GTR, 2002, Car.TypeFuel.petrol, 1110));
        garage.parkIn(new RacingCar(Car.Mark.nissan, Car.Model.GTR, 2002, Car.TypeFuel.petrol, 1110));
        garage.brandInGarage(Car.Mark.nissan);
        System.out.println(garage.getGarage());
        System.out.println(garage.getAllCarsInGarage());


//        RacingCar car1 = new RacingCar(Car.Mark.nissan, Car.Model.GTR, 2002, Car.TypeFuel.petrol, 1110);
//        RacingCar car2 = new RacingCar(Car.Mark.toyota, Car.Model.supra, 2010, Car.TypeFuel.petrol, 1110);
//        RacingCar car3 = new RacingCar(Car.Mark.toyota, Car.Model.Rav, 2010, Car.TypeFuel.petrol, 1110);
//        RacingCar car4 = new RacingCar(Car.Mark.audi, Car.Model.R8, 1993, Car.TypeFuel.petrol, 1500);
//        CivicCar car5 = new CivicCar(Car.Mark.audi, Car.Model.R8, 1993, Car.TypeFuel.petrol, 1500);
//        CargoCar car12 = new CargoCar(Car.Mark.toyota, Car.Model.supra, 2010, Car.TypeFuel.petrol, 1110);
//        MilitaryCar car15 = new MilitaryCar(Car.Mark.tank, Car.Model.T85, 1972, Car.TypeFuel.diesel, 40000);
//        MilitaryCar car16 = new MilitaryCar(Car.Mark.tank, Car.Model.T85, 1972, Car.TypeFuel.diesel, 40000);
//
//        Map<Car, Integer> allCarInGarage = new HashMap<>();
//
//        Garage garage=new Garage(allCarInGarage);




//
//        System.out.println("В гараже находятся авто:");
//        System.out.println(allCarInGarage);
//        System.out.println("В гараже припарковался авто: ");
//        parking(car1, allCarInGarage);
//        System.out.println(allCarInGarage);
//        System.out.println("В гараже припарковался авто: ");
//        parking(car2, allCarInGarage);
//        System.out.println(allCarInGarage);
//        System.out.println("В гараже припарковался авто: ");
//        parking(car3, allCarInGarage);
//        System.out.println(allCarInGarage);
//        System.out.println("В гараже припарковался авто: ");
//        parking(car4, allCarInGarage);
//        System.out.println(allCarInGarage);
//        System.out.println("В гараже припарковался авто: ");
//        parking(car15, allCarInGarage);
//        System.out.println(allCarInGarage);
//        System.out.println("Точно таких же авто в гараже: " + sortSameCar(car16, allCarInGarage));
//        System.out.println("В гараже припарковался авто: ");
//        parking(car16, allCarInGarage);
//        System.out.println(allCarInGarage);
//        System.out.println(sortCarByCar(car2, allCarInGarage));
//        System.out.println("В гараже припарковался авто: ");
//        parking(car12, allCarInGarage);
//        System.out.println(allCarInGarage);
//        System.out.println(sortCarByCar(car2, allCarInGarage));
//        System.out.println("В гараже припарковался авто: ");
//        parking(car5, allCarInGarage);
//        System.out.println(allCarInGarage);
//        System.out.println("Авто такой массы в гараже: " + sortCarMass(1110, allCarInGarage));
//        System.out.println("Авто такой марки в гараже: " + sortCarMark(Car.Mark.toyota, allCarInGarage));
//        System.out.println("Авто такой модели в гараже: " + sortCarModel(Car.Model.supra, allCarInGarage));
//        System.out.println("Авто такого типа топлива в гараже: " + sortCarTypeFuel(Car.TypeFuel.petrol, allCarInGarage));
//        System.out.println("Авто такого года в гараже: " + sortCarAge(2010, allCarInGarage));
//        System.out.println("Точно таких же авто в гараже: " + sortSameCar(car16, allCarInGarage));
//        System.out.println(sortCarByCar(car2, allCarInGarage));
//        System.out.println("Из гаража выехало авто: ");
//        departureCar(car4, allCarInGarage);
//        System.out.println(allCarInGarage);
//        System.out.println(sortCarByCar(car2, allCarInGarage));
//        System.out.println("Из гаража выехало авто: ");
//        departureCar(car2, allCarInGarage);
//        System.out.println(allCarInGarage);
//        System.out.println("Авто такой массы в гараже: " + sortCarMass(1110, allCarInGarage));
//        System.out.println("Авто такой марки в гараже: " + sortCarMark(Car.Mark.toyota, allCarInGarage));
//        System.out.println("Авто такой модели в гараже: " + sortCarModel(Car.Model.supra, allCarInGarage));
//        System.out.println("Авто такого типа топлива в гараже: " + sortCarTypeFuel(Car.TypeFuel.petrol, allCarInGarage));
//        System.out.println("Авто такого года в гараже: " + sortCarAge(2010, allCarInGarage));
//        System.out.println("Точно таких же авто в гараже: " + sortSameCar(car16, allCarInGarage));
//    }
//
//    public static void parking(Car x, Map<Car, Integer> carMap) {
//        int oldValue;
//        int value = 1;
//        if (!carMap.containsKey(x)) {
//            carMap.put(x, value);
//        } else {
//            oldValue = carMap.get(x);
//            carMap.put(x, oldValue + value);
//        }
//    }
//
//    public static void departureCar(Car x, Map<Car, Integer> carMap) {
//        int oldValue = carMap.get(x);
//        if (carMap.containsKey(x)) {
//            carMap.put(x, oldValue - 1);
//        }
//        if (carMap.containsValue(0)) {
//            carMap.remove(x);
//        }
//    }
//
//    public static String sortCarByCar(Car x, Map<Car, Integer> carMap) {
//        int valueMark = 0;
//        int valueModel = 0;
//        int valuefuelType = 0;
//        int valueAge = 0;
//        int valueMass = 0;
//        for (Map.Entry<Car, Integer> entry : carMap.entrySet()) {
//            if (entry.getKey().getMark().equals(x.getMark())) {
//                valueMark = valueMark + entry.getValue();
//            }
//            if (entry.getKey().getModel().equals(x.getModel())) {
//                valueModel = valueModel + entry.getValue();
//            }
//            if (entry.getKey().getType().equals(x.getType())) {
//                valuefuelType = valuefuelType + entry.getValue();
//            }
//            if (entry.getKey().getAge() == (x.getAge())) {
//                valueAge = valueAge + entry.getValue();
//            }
//            if (entry.getKey().getMass() == (x.getMass())) {
//                valueMass = valueMass + entry.getValue();
//            }
//        }
//        return "Сравнение с характеристиками выбранного авто {" + "Авто данной марки: " + valueMark + " Авто данной модели: " + valueModel + " Авто данного типа топлива: " + valuefuelType + " Авто данного года: " + valueAge + " Авто данной массы: " + valueMass + "}";
//    }
//
//    public static int sortCarMass(int mass, Map<Car, Integer> carMap) {
//        int quantitySame = 0;
//        for (Map.Entry<Car, Integer> entry : carMap.entrySet()) {
//            if (entry.getKey().getMass() == mass) {
//                quantitySame = quantitySame + entry.getValue();
//            }
//        }
//        return quantitySame;
//    }
//
//    public static int sortCarMark(Car.Mark mark, Map<Car, Integer> carMap) {
//        int quantitySame = 0;
//        for (Map.Entry<Car, Integer> entry : carMap.entrySet()) {
//            if (entry.getKey().getMark() == mark) {
//                quantitySame = quantitySame + entry.getValue();
//            }
//        }
//        return quantitySame;
//    }
//
//    public static int sortCarModel(Car.Model model, Map<Car, Integer> carMap) {
//        int quantitySame = 0;
//        for (Map.Entry<Car, Integer> entry : carMap.entrySet()) {
//            if (entry.getKey().getModel() == model) {
//                quantitySame = quantitySame + entry.getValue();
//            }
//        }
//        return quantitySame;
//    }
//
//    public static int sortCarTypeFuel(Car.TypeFuel typeFuel, Map<Car, Integer> carMap) {
//        int quantitySame = 0;
//        for (Map.Entry<Car, Integer> entry : carMap.entrySet()) {
//            if (entry.getKey().getType() == typeFuel) {
//                quantitySame = quantitySame + entry.getValue();
//            }
//        }
//        return quantitySame;
//    }
//
//    public static int sortCarAge(int age, Map<Car, Integer> carMap) {
//        int quantitySame = 0;
//        for (Map.Entry<Car, Integer> entry : carMap.entrySet()) {
//            if (entry.getKey().getAge() == age) {
//                quantitySame = quantitySame + entry.getValue();
//            }
//        }
//        return quantitySame;
//    }
//
//    public static int sortSameCar(Car car, Map<Car, Integer> carMap) {
//        int quantitySame = 0;
//        for (Map.Entry<Car, Integer> entry : carMap.entrySet()) {
//            if (entry.getKey().equals(car)) {
//                quantitySame = quantitySame + entry.getValue();
//            }
//        }
//        return quantitySame;
    }
}
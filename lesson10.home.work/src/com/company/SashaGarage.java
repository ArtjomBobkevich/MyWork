package com.company;


import com.company.*;

import java.util.HashMap;
import java.util.Map;

public class SashaGarage {

    private static HashMap<Car, Integer> garage;

    public SashaGarage() {
        SashaGarage.garage = new HashMap<>();
    }

    public void parkIn(Car... car) {
        for (Car car1 : car) {
            if (garage.containsKey(car1)) {
                garage.put(car1, garage.get(car1) + 1);
            } else {
                garage.put(car1, 1);
            }
        }
    }

    public int brandInGarage(Car.Mark mark) {
        return garage.entrySet().stream().filter(entry -> entry.getKey().getMark().equals(mark))
                .mapToInt(Map.Entry::getValue)
                .sum();
    }

    public boolean parkOut(Car car) {
        if (garage.containsKey(car)) {
            garage.put(car, garage.get(car) - 1);
            if (garage.get(car) == 0) {
                garage.remove(car);
            }
            return true;
        } else {
            return false;
        }
    }

    public int getTruckQty() {
        int result = 0;
        for (Car car : garage.keySet()) {
            if (car instanceof CargoCar) {
                result += garage.get(car);
            }
        }
        return result;
    }

    public int getPassangerCarQty() {
        int result = 0;
        for (Car car : garage.keySet()) {
            if (car instanceof CivicCar) {
                result += garage.get(car);
            }
        }
        return result;
    }

    public int getMinivanQty() {
        int result = 0;
        for (Car car : garage.keySet()) {
            if (car instanceof MilitaryCar) {
                result += garage.get(car);
            }
        }
        return result;
    }

    public int getPickupQty() {
        int result = 0;
        for (Car car : garage.keySet()) {
            if (car instanceof RacingCar) {
                result += garage.get(car);
            }
        }
        return result;
    }

    public int getBrandQty(Car.Mark mark) {
        int result = 0;
        for (Car car : garage.keySet()) {
            if (car.getMark().equals(mark)) {
                result += garage.get(car);
            }
        }
        return result;
    }

    public int getYearQty(int year) {
        int result = 0;
        for (Car car : garage.keySet()) {
            if (car.getAge() == year) {
                result += garage.get(car);
            }
        }
        return result;
    }

    public int getAllCarsInGarage() {
        int counter = 0;
        if (!garage.isEmpty()) {
            for (Integer value : garage.values()) {
                counter += value;
            }
        }
        return counter;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Car car : garage.keySet()) {
            result.append("Машин : ").append(car.getMark()).append(" ").append(car.getModel())
                    .append(" в гараже : ").append(garage.get(car)).append("\n");
        }
        return result.toString();
    }

    public boolean isCarInGarage(Car car) {
        return garage.containsKey(car);
    }

    public Map<Car, Integer> getGarage() {
        return garage;
    }
}
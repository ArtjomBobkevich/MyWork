package com.company;

import java.util.*;

public class Garage {

    private Map<Car,Integer> garage;

    public Garage(Map<Car, Integer> garage) {
        this.garage = garage;
    }

    public Map<Car, Integer> getGarage() {
        return garage;
    }
}

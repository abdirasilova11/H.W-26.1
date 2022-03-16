package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Car, CarInfo > carInfo = new HashMap<>();
        carInfo.put(new Car(123, "567CAE"),
                new CarInfo(2008,"blue", "Mers G-550",5000));
        carInfo.put(new Car(45,"456ABC"),
                new CarInfo(2004, "white", "Honda accord", 2700));
        for (Map.Entry cars : carInfo.entrySet()) {
            System.out.println(cars.getKey() + " " + cars.getValue());
        }
    }
}

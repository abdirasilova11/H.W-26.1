package com.company;

public class Car {
private int id;
private  String numberCars;



    public Car(int id, String numberCars) {
        this.id = id;
        this.numberCars = numberCars;
    }

    @Override
    public String toString() {
        return "ID:" + id +
                " car number:" + numberCars;
    }
}

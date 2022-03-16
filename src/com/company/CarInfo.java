package com.company;

public class CarInfo {
private int year;
private  String color;
private String model;
private int price;


    public CarInfo(int year, String color, String model, int price) {
        this.year = year;
        this.color = color;
        this.model = model;
        this.price = price;
    }
    @Override
    public String toString(){
        return "year:" + year +
                " color:" + color +
                " model:" + model +
                " price:" + price;
    }

}

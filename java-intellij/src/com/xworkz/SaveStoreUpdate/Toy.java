package com.xworkz.SaveStoreUpdate;

public class Toy{
    String name;
    String color;
    double price;
    boolean batteryRequired;
    String brand;


    Toy(String name, String color, double price, boolean batteryRequired, String brand){
        this.name = name;
        this.color = color;
        this.price = price;
        this.batteryRequired = batteryRequired;
        this.brand = brand;
    }

    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Battery Required: " + batteryRequired);
        System.out.println("Brand: " + brand);
    }

}

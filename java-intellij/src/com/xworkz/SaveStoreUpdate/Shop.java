package com.xworkz.SaveStoreUpdate;

public class Shop {

    String name;
    String location;
    boolean Available;
    int Cost;
    double profit;

    public Shop(String name, String location, boolean Available, int Cost, double profit) {
        this.name = name;
        this.location = location;
        this.Available = Available;
        this.Cost = Cost;
        this.profit = profit;
    }

    public void info() {
        System.out.println("Name: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("Stock Available: " + this.Available);
        System.out.println("Cost: " + this.Cost);
        System.out.println("Profit: " + this.profit);
    }
}

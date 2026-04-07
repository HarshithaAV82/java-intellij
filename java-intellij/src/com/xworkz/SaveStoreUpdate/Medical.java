package com.xworkz.SaveStoreUpdate;

public class Medical {

    String medicineName;
    String company;
    boolean available;
    int price;
    double profit;

    public Medical(String medicineName, String company, boolean available, int price, double profit) {
        this.medicineName = medicineName;
        this.company = company;
        this.available = available;
        this.price = price;
        this.profit = profit;
    }

    public void info() {
        System.out.println("Medicine Name: " + this.medicineName);
        System.out.println("Company: " + this.company);
        System.out.println("Available: " + this.available);
        System.out.println("Price: " + this.price);
        System.out.println("Profit: " + this.profit);
    }
}
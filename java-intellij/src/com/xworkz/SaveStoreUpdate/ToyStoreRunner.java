package com.xworkz.SaveStoreUpdate;

public class ToyStoreRunner{
    public static void main(String[] args) {
        String[] toys = new String[10];
        ToyStore store = new ToyStore(toys);

        store.getToyName("Car");
        store.getToyName("Doll");
        store.getToyName("Train");
        store.getToyName("Robot");


        System.out.println(store.searchToyName("Car"));
        System.out.println(store.searchToyName("Plane"));


        store.update("car", "Teddy");
        store.update("Drone", "Train");

    }

}

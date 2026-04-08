package com.xworkz.methodOverride.Burger;

public class CheeseBurger extends Burger{

    @Override
    public void getTaste() {
        System.out.println("executing getTaste in CheeseBurger.....");
    }
}

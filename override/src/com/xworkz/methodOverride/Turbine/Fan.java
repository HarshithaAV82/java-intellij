package com.xworkz.methodOverride.Turbine;

public class Fan extends Turbine{

    @Override
    public void rotate() {
        System.out.println("executing rotate in Fan...");
    }
}

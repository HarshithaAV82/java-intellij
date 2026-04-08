package com.xworkz.methodOverride.Bank;

public class SBI extends Bank{

    @Override
    public void getInterestRate() {
        System.out.println("running getIntrestRate in SBI");
    }
}

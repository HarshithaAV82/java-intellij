package com.xworkz.methodOverride.OldPayment;

public class SmartPay extends OldPayment{

    @Override
    public void pay() {
        System.out.println("running pay in Smartpay....");
    }
}

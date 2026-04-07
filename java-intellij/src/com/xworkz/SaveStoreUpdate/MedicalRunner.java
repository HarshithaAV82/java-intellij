package com.xworkz.SaveStoreUpdate;

public class MedicalRunner{

    public static void main(String[] args){

        Medical medical = new Medical("Paracetamol", "Apollo", true, 50, 10);

        Medical[] medicals = new Medical[3];

        StoreMedical storeMedical = new StoreMedical(medicals);

        storeMedical.save(medical);


        storeMedical.search(50);


        storeMedical.update(10, 20);
    }
}
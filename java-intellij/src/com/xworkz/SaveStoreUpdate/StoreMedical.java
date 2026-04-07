package com.xworkz.SaveStoreUpdate;

public class StoreMedical{


    Medical[] medicals;
    int currentIndex;

    StoreMedical(Medical[] medicals){
        this.medicals = medicals;
    }

    void save(Medical medical){
        if (this.medicals != null && medical != null){
            if (this.currentIndex < medicals.length) {
                this.medicals[currentIndex] = medical;
                System.out.println("Stored at index: " + currentIndex);
                medical.info();
                currentIndex++;
            } else {
                System.out.println("Array is full");
            }
        }
    }

    boolean search(int price) {
        if (this.medicals != null) {
            for (Medical medical : this.medicals) {
                if (medical != null && medical.price == price) {
                    System.out.println("Medicine Found:");
                    medical.info();
                    return true;
                }
            }
        }
        System.out.println("Medicine not found");
        return false;
    }

    public void update(double oldProfit, double newProfit) {
        if (this.medicals != null) {
            for (Medical medical : this.medicals) {
                if (medical != null && medical.profit == oldProfit) {
                    System.out.println("Before Update: " + medical.profit);
                    medical.profit = newProfit;
                    System.out.println("After Update: " + medical.profit);
                }
            }
        }
    }
}
package com.xworkz.SaveStoreUpdate;

public class StoreShop {


        Shop[] shops;
        int currentIndex;

        StoreShop(Shop[] shops) {
            this.shops = shops;
        }

        void save(Shop shop) {
            if (this.shops != null && shop != null) {
                if (this.currentIndex < shops.length) {
                    this.shops[currentIndex] = shop;
                    System.out.println("Stored at index: " + currentIndex);
                    shop.info();
                    currentIndex++;
                } else {
                    System.out.println("Array is full");
                }
            }
        }

        boolean search(int invest) {
            if (this.shops != null) {
                for (Shop shop : this.shops) {
                    if (shop != null && shop.Cost == invest) {
                        System.out.println("Shop Found:");
                        shop.info();
                        return true;
                    }
                }
            }
            System.out.println("Shop not found");
            return false;
        }

        public void update(double profits, double newProfits) {
            if (this.shops != null) {
                for (Shop shop : this.shops) {
                    if (shop != null && shop.profit == profits) {
                        System.out.println("Before Update: " + shop.profit);
                        shop.profit = newProfits;
                        System.out.println("After Update: " + shop.profit);
                    }
                }
            }
        }
    }


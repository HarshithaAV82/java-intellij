package com.xworkz.SaveStoreUpdate;

public class ShopRunner {

    public static void main(String[] args) {

        Shop shop = new Shop("bikes", "micko", true, 100000, 20000);

        Shop[] shops = new Shop[3];

        StoreShop storeShop = new StoreShop(shops);

        storeShop.save(shop);


        storeShop.search(100000);


        storeShop.update(20000, 70000);
    }
}

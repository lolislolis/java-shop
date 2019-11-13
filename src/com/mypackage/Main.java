package com.mypackage;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Product trouser = new Product("Byxor",2,9);
        Product socks = new Product("Strumpor",22,1);



        Shop shop = new Shop();
        shop.add(trouser);
        shop.add(socks);
        shop.add(socks);
        shop.checkout();
    }
}

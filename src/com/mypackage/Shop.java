package com.mypackage;
import java.util.ArrayList;

class Shop {

    private ArrayList<Product> items = new ArrayList<Product>();

    void add(Product product) {
        if (product.stock >= 1) {
            product.stock -= 1;
            items.add(product);
            String message = String.format("%s was added to cart! :)", product.name);
            System.out.println(message);
        } else {
            String message = String.format("%s is out of stock!", product.name);
            System.out.println(message);
        }
    }

    void checkout() {
        int total = 0;
        for(Product p: items) {
            System.out.println("The name of the product is " + p.name);
            total += p.price;
        }
        System.out.println("Total is " + total);

        System.out.println("hejdå allihoppa :)");
    }

}

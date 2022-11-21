package com.ArrayList;

import java.util.ArrayList;

public class ListOfProducts {
    public static void main(String[] args) {
        Product p1 = new Product("Himalaya", 35675, "good", 40);
        Product p2 = new Product("Santoor", 97632, "Soft skin", 35);
        Product p3 = new Product("Medimix", 57931, "", 30);

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);

        Order o1 = new Order(12345, 76548, productList);  //order1
        o1.TotalPrice();

        ArrayList<Product> productListA = new ArrayList<>();   //order2
        Order o2 = new Order(35, 354, productListA);

        System.out.println(o2.getProductList().size());
        o2.addProduct(p2);
        System.out.println(o2.getProductList().size());

        o1.removeById(57931);
        System.out.println(o1.getProductList().size());
    }
}

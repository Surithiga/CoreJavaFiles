package com.ArrayList;

import java.util.ArrayList;

public class Order {
    private int orderId;
    private int customerId;
    private ArrayList<Product> productList;

    public Order(int orderId, int customerId, ArrayList<Product> productList) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.productList = productList;

    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public void TotalPrice() {
        int sum = 0;
        for (Product product : productList) {
            sum = sum + product.getPrice();
        }
        System.out.println(sum);
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeById(int productId) {
        ArrayList<Product> products = new ArrayList<>();
        for (Product product : productList) {
            if (product.getId() != productId) {
                products.add(product);
            }
        }
        productList = products;
    }
}



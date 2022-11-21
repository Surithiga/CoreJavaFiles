package com.ArrayList;

import java.util.List;

public class Product {
    private String title;
    private int id;
    private String description;
    private int price;


    public Product(String title, int id, String description, int price) {
        this.title=title;
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

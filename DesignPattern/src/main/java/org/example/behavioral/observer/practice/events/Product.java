package org.example.behavioral.observer.practice.events;

public class Product {
    private String Name;
    private double price;

    public Product(String name, double price) {
        Name = name;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Name='" + Name + '\'' +
                ", price=" + price +
                '}';
    }
}

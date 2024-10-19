package org.example.behavioral.strategy.violation;

public class Product {
    private String name;
    private  double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculatePrice(CustomerType type){
        if(type.equals(CustomerType.REGULAR)){
           return price;
        }else if(type.equals(CustomerType.GOLD)){
            return price * 0.9;
        }else if(type.equals(CustomerType.PREMIUM)){
            return price * 0.8;
        }
        return price;
    }
}

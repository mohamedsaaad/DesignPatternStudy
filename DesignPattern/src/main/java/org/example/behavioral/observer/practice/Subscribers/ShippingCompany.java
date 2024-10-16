package org.example.behavioral.observer.practice.Subscribers;

public class ShippingCompany implements Subscriber{
    String name;

    public ShippingCompany(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.println(name +" is receiving notification about: "+ message);
    }
}

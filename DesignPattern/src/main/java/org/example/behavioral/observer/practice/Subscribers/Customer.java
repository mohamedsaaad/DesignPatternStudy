package org.example.behavioral.observer.practice.Subscribers;

public class Customer implements Subscriber{
    private String name;

    public Customer(String name) {
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
        System.out.println("notifying user "+name + " "+ message);
    }
}

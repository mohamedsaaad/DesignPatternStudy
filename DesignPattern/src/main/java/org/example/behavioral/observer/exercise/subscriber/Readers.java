package org.example.behavioral.observer.exercise.subscriber;

public class Readers implements Subscriber{

    private String name;

    public Readers(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.println("notifying user "+name +" "+message);
    }
}

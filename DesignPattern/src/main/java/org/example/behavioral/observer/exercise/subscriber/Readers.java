package org.example.behavioral.observer.exercise.subscriber;

import org.example.behavioral.observer.exercise.Notification;

public class Readers implements Subscriber{
    private String name;

    public Readers(String name) {
        this.name = name;
    }

    @Override
    public void notify(Notification notification) {
        System.out.println("Notifying user " + name + " about " + notification.getEventType() + ": " + notification.getMessage());
    }
}

package org.example.behavioral.observer.exercise;

import org.example.behavioral.observer.exercise.event.EventType;

public class Notification {
    private String message;
    private EventType eventType;

    public Notification(String message, EventType eventType) {
        this.message = message;
        this.eventType = eventType;
    }

    public String getMessage() {
        return message;
    }

    public EventType getEventType() {
        return eventType;
    }
}

package org.example.behavioral.observer.exercise.publisher;

import org.example.behavioral.observer.exercise.Notification;
import org.example.behavioral.observer.exercise.event.EventType;
import org.example.behavioral.observer.exercise.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObserverManager {
    private Map<EventType, List<Subscriber>> subscribers;

    public ObserverManager() {
        this.subscribers = new HashMap<>();
        for (EventType eventType : EventType.values()) {
            subscribers.put(eventType, new ArrayList<>());
        }
    }

    public void subscribe(EventType eventType, Subscriber subscriber) {
        subscribers.get(eventType).add(subscriber);
    }

    public void unsubscribe(EventType eventType, Subscriber subscriber) {
        subscribers.get(eventType).remove(subscriber);
    }

    public void notifySubscribers(EventType eventType, Notification notification) {
        subscribers.get(eventType).forEach(subscriber -> subscriber.notify(notification));
    }
}

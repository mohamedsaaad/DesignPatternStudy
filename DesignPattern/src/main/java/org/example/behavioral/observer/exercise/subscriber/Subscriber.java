package org.example.behavioral.observer.exercise.subscriber;

import org.example.behavioral.observer.exercise.Notification;

public interface Subscriber {

    void notify(Notification notification);
}

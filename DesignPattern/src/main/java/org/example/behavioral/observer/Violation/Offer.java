package org.example.behavioral.observer.Violation;

public class Offer {
    private String message;

    public Offer(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "message='" + message + '\'' +
                '}';
    }
}

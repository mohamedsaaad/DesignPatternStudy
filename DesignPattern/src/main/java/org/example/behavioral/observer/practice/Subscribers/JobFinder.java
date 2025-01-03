package org.example.behavioral.observer.practice.Subscribers;

public class JobFinder implements Subscriber{
    String name;

    public JobFinder(String name) {
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
        System.out.println("notify user "+name+ " " + message);
    }
}

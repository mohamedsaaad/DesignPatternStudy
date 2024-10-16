package org.example.behavioral.observer.practice.publisher;

import org.example.behavioral.observer.practice.events.EventType;
import org.example.behavioral.observer.practice.events.Job;
import org.example.behavioral.observer.practice.events.Offer;
import org.example.behavioral.observer.practice.events.Product;
import org.example.behavioral.observer.practice.Subscribers.Subscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarketPlace {

    private Map<EventType,List<Subscriber>> subscribers;
    private List<Offer> offers;
    private List<Product> products;
    private List<Job> jobs;

    public MarketPlace() {
        this.subscribers = new HashMap<>();
        initializingEvents();
        this.offers = new ArrayList<>();
        this.products = new ArrayList<>();
        this.jobs=new ArrayList<>();
    }

    private void initializingEvents() {
        subscribers.put(EventType.NEW_OFFER,new ArrayList<>());
        subscribers.put(EventType.NEW_PRODUCT,new ArrayList<>());
        subscribers.put(EventType.JOB_OFFER,new ArrayList<>());
        subscribers.put(EventType.NEW_ORDER,new ArrayList<>());
    }

    public void subscribe(EventType eventType,Subscriber subscriber){
        subscribers.get(eventType).add(subscriber);
    }

    public void unSubscribe(EventType eventType,Subscriber subscriber){
        subscribers.get(eventType).remove(subscriber);
    }
    public void addOffer(Offer offer,String message){
        offers.add(offer);
        notifyUser(EventType.NEW_OFFER,message);
    }

    public void addProduct(Product product,String message){
        products.add(product);
        notifyUser(EventType.NEW_PRODUCT,message);
    }

    public void addJob(Job job,String message){
        jobs.add(job);
        notifyUser(EventType.JOB_OFFER,message +job.getTitle());
    }
    private void notifyUser(EventType eventType,String message) {
        subscribers.get(eventType).forEach(user->{
                user.notify(message);
        });
    }

}

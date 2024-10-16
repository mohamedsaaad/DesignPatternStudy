package org.example.behavioral.observer.practice;

import org.example.behavioral.observer.practice.Subscribers.Customer;
import org.example.behavioral.observer.practice.Subscribers.JobFinder;
import org.example.behavioral.observer.practice.Subscribers.ShippingCompany;
import org.example.behavioral.observer.practice.Subscribers.Subscriber;
import org.example.behavioral.observer.practice.events.EventType;
import org.example.behavioral.observer.practice.events.Job;
import org.example.behavioral.observer.practice.events.Offer;
import org.example.behavioral.observer.practice.events.Product;
import org.example.behavioral.observer.practice.publisher.MarketPlace;

public class Main {
    public static void main(String[] args) {
        MarketPlace marketPlace= new MarketPlace();
        Subscriber saad=new Customer("SAAD");
        Subscriber manar=new Customer("MANAR");
        Subscriber mostafa=new Customer("MOSTAFA");
        Subscriber marwan=new Customer("marwan");

        marketPlace.subscribe(EventType.NEW_PRODUCT,saad);
        marketPlace.subscribe(EventType.NEW_OFFER,saad);
        marketPlace.subscribe(EventType.NEW_PRODUCT,manar);
        marketPlace.subscribe(EventType.NEW_OFFER,manar);
        marketPlace.subscribe(EventType.NEW_OFFER,mostafa);
        marketPlace.subscribe(EventType.NEW_PRODUCT,marwan);

        // when we need to add another type of subscriber like Job finder
        JobFinder mariam=new JobFinder("MARIAM");
        marketPlace.subscribe(EventType.JOB_OFFER,mariam);

        // when we add new Subscriber we never touch the publisher class

        ShippingCompany shippingCompany=new ShippingCompany("DHL");
        marketPlace.subscribe(EventType.NEW_PRODUCT,shippingCompany);
        //try the unsubscribe feature
        marketPlace.unSubscribe(EventType.NEW_OFFER,manar);
        marketPlace.addProduct(new Product("Mobile",155),"new mobile product added");
        marketPlace.addOffer(new Offer("there is a new Offer: "),"20% discount for all items");
        marketPlace.addJob(new Job("Software Engineer"),"there is a new job as a ");
    }

}
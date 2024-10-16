package org.example.behavioral.observer.Violation;

public class Main {
    public static void main(String[] args) {
        MarketPlace marketPlace= new MarketPlace();
        marketPlace.addUser(new User("AMR",true,true));
        marketPlace.addUser(new User("SAAD",false,true));
        marketPlace.addUser(new User("MARWAN",true,false));
        marketPlace.addUser(new User("MOSTAFA",true,false));
        marketPlace.addOffer(new Offer("buy 1 and take 2"));
        marketPlace.addProduct(new Product("ISO100",257));
    }

}
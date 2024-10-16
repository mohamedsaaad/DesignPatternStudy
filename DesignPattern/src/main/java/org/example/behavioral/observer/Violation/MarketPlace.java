package org.example.behavioral.observer.Violation;

import java.util.ArrayList;
import java.util.List;

public class MarketPlace {

    private List<User> users;
    private List<Offer> offers;
    private List<Product> products;

    public MarketPlace() {
        this.users = new ArrayList<>();
        this.offers = new ArrayList<>();
        this.products = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }
    public void addOffer(Offer offer){
        offers.add(offer);
        notifyUser(offer);
    }

    public void addProduct(Product product){
        products.add(product);
        notifyUser(product);
    }

    private void notifyUser(Offer offer) {
        users.forEach(user->{
            if(user.isSubscribedToOffer()){
                user.notifyNewOffer(offer);
            }
        });
    }

    private void notifyUser(Product product) {
        users.forEach(user->{
            if(user.isSubscribedToProduct()){
                user.notifyNewProduct(product);
            }
        });
    }
}

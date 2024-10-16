package org.example.behavioral.observer.Violation;

//1- violation for this class have many reason to change every time I need
// to add something to be notifiable I need to add this flag as new attribute in this class
//2- violation for single responsibility class have many reason to change
// and also there is a violation for Open Closed principle
public class User {
    private String name;
    private boolean isSubscribedToOffer;
    private boolean isSubscribedToProduct;

    public User(String name, boolean isSubscribedToOffer, boolean isSubscribedToProduct) {
        this.name = name;
        this.isSubscribedToOffer = isSubscribedToOffer;
        this.isSubscribedToProduct = isSubscribedToProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSubscribedToOffer() {
        return isSubscribedToOffer;
    }

    public void setSubscribedToOffer(boolean subscribedToOffer) {
        isSubscribedToOffer = subscribedToOffer;
    }

    public boolean isSubscribedToProduct() {
        return isSubscribedToProduct;
    }

    public void setSubscribedToProduct(boolean subscribedToProduct) {
        isSubscribedToProduct = subscribedToProduct;
    }

    public void notifyNewOffer(Offer offer){
        System.out.println("notifying user "+ this.getName() +" new "+ offer.toString());
    }

    public void notifyNewProduct(Product product){
        System.out.println("notifying user "+ this.getName() +" new "+ product.toString());
    }
}

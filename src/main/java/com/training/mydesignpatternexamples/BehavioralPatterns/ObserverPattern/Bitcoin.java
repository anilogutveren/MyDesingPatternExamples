package com.training.mydesignpatternexamples.BehavioralPatterns.ObserverPattern;

public class Bitcoin extends Observable {

    private double minPrice;
    private double maxPrice;
    private double currentPrice;

    public Bitcoin(double currentPrice, double minPrice, double maxPrice) {
        this.currentPrice = currentPrice;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public double currentPrice() {
        return currentPrice;
    }

    /*
     * Bu method currentPrice i set ediyor ve kontrol ediyor.
     * Eğer currentPrice maxPrice veya minPrice dan büyükse veya küçükse maxPrice i güncelliyor ve sendNotification methodunu çağırıyor.
     * */
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
        controlPrice(currentPrice);
    }

    private void controlPrice(double price) {
        if (price > maxPrice || price < minPrice) {
            maxPrice = price;
            sendNotification();
        }
    }
}

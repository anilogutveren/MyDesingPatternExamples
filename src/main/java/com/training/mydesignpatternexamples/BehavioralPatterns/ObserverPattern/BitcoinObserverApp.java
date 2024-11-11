package com.training.mydesignpatternexamples.BehavioralPatterns.ObserverPattern;

public class BitcoinObserverApp {


    public static void main(String[] args) {

        // Create a Bitcoin object (Observable)
        Bitcoin bitcoin = new Bitcoin(1000, 800, 1300);

        // Create an Investor object (Observer)
        Investor alice = new Investor("Alice");

        // Add the observer to the observable
        bitcoin.ekle(alice);

        // Change the price of the bitcoin for testing
        for (int i = 0; i < 5; i++) {
            bitcoin.setCurrentPrice(1000 + i * 100);
        }

    }
}

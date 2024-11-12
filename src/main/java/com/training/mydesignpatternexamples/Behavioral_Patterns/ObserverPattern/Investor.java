package com.training.mydesignpatternexamples.Behavioral_Patterns.ObserverPattern;

public class Investor implements Observer {

    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable) {

        Bitcoin bitcoin = (Bitcoin) observable;

        System.out.println("Hey " + name + ", Bitcoin price has exceeded " + bitcoin.currentPrice() + " dollars");
    }
}

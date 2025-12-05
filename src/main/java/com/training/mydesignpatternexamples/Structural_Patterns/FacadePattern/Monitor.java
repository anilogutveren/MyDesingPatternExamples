package com.training.mydesignpatternexamples.Structural_Patterns.FacadePattern;

public class Monitor implements Device {
    @Override
    public void start() {
        System.out.println("Monitor: Power on and displaying boot screen.");
    }

    @Override
    public void stop() {
        System.out.println("Monitor: Power off.");
    }
}


package com.training.mydesignpatternexamples.Structural_Patterns.FacadePattern;

public class Ram implements Device {
    @Override
    public void start() {
        System.out.println("RAM: Allocating memory and initializing buffers.");
    }

    @Override
    public void stop() {
        System.out.println("RAM: Clearing memory allocations.");
    }
}

